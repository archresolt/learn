/**
* 使用npm run server来启动
*/
//引入数据库模组，在后台import是用不了的，用的均是 require
const client = require('./redis-conn');
//引入nodejs的http模组
const http = require('http');
var url = require('url');
var util = require('util');


/**
 * req（request）请求，存放浏览器发来的请求信息
 * res（response）响应，服务器响应该请求的对应操作对象
 */
const server = http.createServer(function (req, res) {
    const httpError = (msg) => {
        res.write({
            errcode: '001',
            msg
        });
        res.end();
    }
    const redisResponse = (err, data) => {
        if (err) {
            console.log('--执行错误：', err);
            res.write(JSON.stringify(
                {
                    errcode: '004',
                    msg: err,
                }
            ))
            res.end();
            return;
        }
        console.log('--执行完成：', data);
        res.write(JSON.stringify(data));
        res.end();
    };
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    //创建一个服务器，网页发起的请求，会由该函数响应
    var post = "";
    console.log('收到客户端的请求了，请求路径是：', req.url)

    //收集post请求
    req.on('data', function (chunk) {
        post += chunk;
    });

    // 在end事件触发后，通过querystring.parse将post解析为真正的POST请求格式，然后向客户端返回。
    req.on('end', function () {
        console.log('请求字段', post)
        let msg = post.trim().startsWith("{") ? JSON.parse(post) : post;
        if (req.url == '/hset') {
            d = msg.data;
            if (typeof (d) == 'object') {
                d = JSON.stringify(d);
            }
            // 这里的client是redis客户端，该客户端用来连接数据库
            client.hset(msg.key, msg.field, d, redisResponse);
        }
        else if (req.url == '/hmset') {
            client.hmset(msg.key, msg.data, redisResponse);
        } else if (req.url == '/hgetall') {
            client.hgetall(msg.key, redisResponse);
        } else if (req.url == '/hget') {
            client.hget(msg.key, msg.field, redisResponse);
        } else if (req.url == "/text") {
            res.write("我接到了post " + post);
            res.end()
        } else if (req.url == "/getTableData") {
            let data = [{
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-04',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1517 弄'
            }, {
                date: '2016-05-01',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1519 弄'
            }, {
                date: '2016-05-03',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1516 弄'
            }];
        
            res.write(JSON.stringify(data));
            res.end();
        } else {
            httpError("无法响应该请求" + req.url);
        }

    });
    // res 对象有一个方法：write 可以用来给客户端发送响应数据
    // write 可以使用多次，但是最后一定要使用 end 来结束响应，否则客户端会一直等待
    //write只能发字符串，所以使用JSON.stringify把数据转为字符串。(前端会直接转回json格式)

});


server.listen(3001, function () {
    console.log('服务器启动成功了，可以通过 http://localhost:3001/ 来进行访问')
})
/**
 * module.exports用于表示该文件被require引用时，对外暴露的内容
 * module是模组的意思
 * exports是出口的意思，这里指“对外暴露内容”
 * 
 * 如果module A没有module.exports require("A")返回undefined
 * 如果有，module.exports=返回内容
 */
module.exports = {

}