<template>

  <div style="background:rgba(255,255,255,1)" >
    <!-- <jieShaoYe></jieShaoYe> -->
    
    <!-- :gutter="0" ,在el-row里面加入gutter来控制分栏之间的间隔，默认间隔是0 -->
    <!-- 头部的背景和eublue -->
    <el-row >
      <el-col  :span="24" class="header" style="height:730px;margin-top:-90px">
        <el-col :span="16" style="height:730px">
          <el-row class="header-enblue-solt">
            <el-col :span="12" :offset="10" class="header-enblue">EnBlue</el-col>
          </el-row>
          <!-- 热爱海洋部分 -->
          <el-row style="height:50px;">
            <el-col :span="8" class="love-ocean" :offset="14">
              <div style="float:left;">连接海洋</div>
              <img
                src="/static/img/indexFirst/images1/lianjie.png "
                style="display:inlineblock;float:left;margin-top:25px "
              />
              <div style="float:left;">和热爱生活的你</div>
            </el-col>
          </el-row>
          <el-row style="height:113px;">
            <el-col :span="4" :offset="18" class="download-buttom">立即下载</el-col>
          </el-row>
        </el-col>
        <el-col :span="8" style="height:730px">
          <el-col class="header-iphone">
            <img :src="iphoneImg.img" style=" height: 400px; width:200px;" />
          </el-col>
        </el-col>
      </el-col>
    </el-row>

    <!-- 推荐行程分隔栏 -->
    <el-row class="recmd-travel">
      <el-col :offset="2" :span="20" style="height:100px ; ">
        <el-col :span="6" :offset="9" class="recmd-text">
          <div class="recmd-img">
            <img :src="recmdImg.img" />
          </div>
        </el-col>
      </el-col>
    </el-row>

    <!-- 轮播组件 -->
    <el-row style="height:600px ;margin-top:69px">
      <el-col :span="18" :offset="3">
        <shuff :shuffingImg="shuffingImgs"></shuff>
      </el-col>
    </el-row>

      <el-row style="height:10px">
        <el-col :span="20" :offset="2" style="height:10px; margin-top:20px">
          <div class="line"></div>
        </el-col>
      </el-row>

    <!-- 社区推荐的部分 -->
    <div class="cummiBigBox">
      <div class="cummiLittleBox">
        <div class="cummiHeader">
          <div class="headerSelf">
            <img
              src="/static/img/indexFirst/images1/Group 2 Copy 3.png"
              style=" height: 75px; width:235px;"
            />
          </div>
        </div>
        <div class="cummiPhoBox">
          <div class="cummiPho">
            <recomdpho :recmdCmmui="item" v-for="(item,index) in recmdCmmuis" :key="index"></recomdpho>
          </div>
        </div>
        <div style="width:100%">
          <div style="width:95px;height:22px;margin: 0 auto">
            <div class="lookmore">查看更多</div>
            <div style="width:26px;height:20px;float:left;">
              <img src="/static/img/indexFirst/images1/xiangxia copy 2.png" />
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- 发现精彩部分 -->
    <div class="findGoodBox">
      <div class="cummiHeader">
        <div class="headerSelf">
          <img
            src="/static/img/indexFirst/images1/Group 2 Copy 4.png"
            style=" height: 75px; width:235px;"
          />
        </div>
      </div>
      <!-- 四张图，发现精彩的 -->
      <div class="goodThings">
        <findGoodSelf :findGoodFrom="item" v-for="item in findGoodSouce" :key="item.text1"></findGoodSelf>
      </div>
    </div>
    <pagefooter style="margin-top:130px"></pagefooter>
    <!-- 
       <div class = "fourPho">
          <recomdpho :recmdCmmui="item" v-for="item in recmdCmmuis" :key="item.name"></recomdpho>
       </div>
       
        <el-row style="height :100px">
          <div style="margin-left:300px; width:100px;height:22px;background:red;"></div>
    </el-row>-->

    <!--:recmdCmmui = "item" v-for = "item in recmdCmmuis" :key="item.name"  -->
    <!-- <el-col>
    </el-col>-->
  </div>
</template>
<script>
import a from "./shuffling";
import b from "./conRecmdCummi";
import c from "./findGoodSelf";
import pagefooter from "../pagebottom/pagefooter";
import jieShaoYe from "./jieShaoYe";
export default {
  components: {
    findGoodSelf: c,
    shuff: a,
    recomdpho: b,
    pagefooter: pagefooter,
     jieShaoYe:jieShaoYe,
    // jieShaoYe:jieShaoYe,
  },
     mounted() {
      this.$root.$on('intrduce', (visiable) => {
            this.showJieShao = visiable;
        });
     },
  data() {
    return {
        showJieShao:false,
      iphoneImg: {
        img: "/static/img/indexFirst/images1/Group 3 Copy 9.png"
      },
      recmdImg: {
        img: "/static/img/indexFirst/images1/Group 2.png",
        img1: "/static/img/indexFirst/images1/Group 2 Copy 3.png"
      },
      shuffingImgs: [
        {
          img: "/static/img/indexFirst/part1.png"
        },
        {
          img: "/static/img/indexFirst/part2.png"
        },
        {
          img: "/static/img/indexFirst/part3.png"
        }
      ],
      recmdCmmuis: [
        {
          name: "在他的故事里，潜水是第三者，海豚和大海才是真爱",
          pho: "/static/img/indexFirst/part1.png",
          type: "装备，业内新闻",
          readnum: "123",
          talknum: "321",
          date: "2020-12-18"
        },
        {
          name: "这是我找到的现阶段最适合生活方式",
          pho: "/static/img/indexFirst/part1.png",
          type: "装备，业内新闻",
          readnum: "123",
          talknum: "321",
         date: "2020-12-18"
        },
        {
          name: "半空的浪漫，比不上大海里的潜伴",
          pho: "/static/img/indexFirst/part1.png",
          type: "装备，业内新闻",
          readnum: "123",
          talknum: "321",
         date: "2020-12-18"
        },
        {
          name: "在他的故事里，潜水是第三者，海豚和大海才是真爱",
          pho: "/static/img/indexFirst/part1.png",
          type: "装备，业内新闻",
          readnum: "123",
          talknum: "321",
          date: "2020-12-18"
        }
      ],
      findGoodSouce: [
        {
          text1: "课程",
          text2: "在线图片处理，简易操作",
          text3: "一键还原水下场景",
          text4: "目之所及，都是美",

          img: "/static/img/indexFirst/part1.png"
        },
        {
          text1: "装备",
          text2: "在线图片处理，简易操作",
          text3: "一键还原水下场景",
          text4: "目之所及，都是美",

          img: "/static/img/indexFirst/part2.png"
        },
        {
          text1: "预约",
          text2: "在线图片处理，简易操作",
          text3: "一键还原水下场景",
          text4: "目之所及，都是美",

          img: "/static/img/indexFirst/part3.png"
        },
        {
          text1: "日志",
          text2: "在线图片处理，简易操作",
          text3: "一键还原水下场景",
          text4: "目之所及，都是美",

          img: "/static/img/indexFirst/part1.png"
        }
      ]
    };
  }
};
</script>
<style scoped>

.header {
  /* margin-top: -80px; */
  background-image: url(/static/img/indexFirst/images1/headerBg.png);
  background-size: cover;
  background-repeat: no-repeat;
  opacity:0.8;
  /* margin:0 auto; */
}
.header-enblue-solt {
  height: 130px;
  margin-top: 210px;
}
.header-enblue {
  height: 130px;
  /* background: blueviolet; */
  font-size: 130px;
  font-weight: bold;
  color: #ffffff;
}
.header-iphone {
  height: 400px;
  width: 200px;
  /* background: brown; */
  margin-top: 150px;
  margin-left: 160px;
}
.love-ocean {
  height: 56px;
  /* background: chocolate; */
  font-size: 26px;
  font-family: PingFangSC-Semibold, PingFang SC;
  font-weight: 600;
  color: rgba(255, 255, 255, 1);
  line-height: 56px;
  /* float: left; */
}
.download-buttom {
  background: crimson;

  margin-top: 65px;
  height: 48px;
  background: rgba(255, 255, 255, 1);
  box-shadow: 2px 2px 10px 0px rgba(108, 108, 108, 0.5);
  border-radius: 36px;
  /* 字体部分 */

  font-size: 22px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 48px;
}
.header-right {
  height: 300px;
  background: rgb(9, 255, 0);
  /* border: black; */
}
.recmd-travel {
  height: 100px;
}

.recmd-text {
  height: 100px;
  /* background: turquoise; */
}
.recmd-img {
  width: 210;
  height: 75px;
  margin-top: 15px;
}
.lookmore {
  width: 67px;
  height: 22px;
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(0, 0, 0, 1);
  line-height: 22px;
  float: left;
  /* margin-left:410px; */
}
.line {
  width: 1140px;
  height: 2px;
  border: 1px #e5e5e5 solid;
  margin: 0 auto;
  /* padding-top:20px; */
  background: #e5e5e5;
}

.cummiBigBox {
  width: 1440px;
  height: 1140px;
  margin: 0 auto;
  /* background: blue; */
  margin-top: 350px;
}
.cummiLittleBox {
  width: 1140px;
  height: 1018px;
  background: rgba(248, 249, 250, 1);
  border-radius: 80px 0 80px 0;
  margin: 0 auto;
}
.headerSelf {
  width: 185px;
  height: 75px;
  padding-top: 50px;
  margin: 0 auto;
}
.cummiPhoBox {
  width: 100%;
  height: 804px;
}
.cummiPho {
  width: 804px;
  height: 804px;
  margin: 0 auto;
}
.findGoodBox {
  width: 1440px;
  height: 805px;
  margin: 0 auto;
  /* background: lightblue; */
}
.goodThings {
  width: 1440px;
  height: 638px;
  background: #43687f;
  margin-top: 80px;
}

/* .recmd-cmmui1 {
  height: 1018px;
  background: wheat;
}
.recmd-cmmui-background {
  height: 1100px;
  background: blue;
}
.square{
  width:1140px;
  height:1018px;
  background:rgba(248,249,250,1);
}
.fourPho{
  width:804px;
  height:804px;
} */
</style>