/**
 * 该模组用于连接redis（一种数据库）
 * redis的window安装在项目下的/reids
 * 
 */
//引用命令行执行工具
var child = require('child_process');
//引入redis连接工具
var redis = require('redis');

var db = {
    port: 6379,
    ip: '127.0.0.1'
};
//启动redis服务
child.exec('call "./redis/redis-server.exe" ./redis/redis.windows.conf', function (err, sto) {
    console.log('--redis启动成功', err, sto);


});

//连接redis
var client = redis.createClient(db.port, db.ip);
client.on('connect', function () {
    console.log('--reids连接成功')
})

module.exports = client;