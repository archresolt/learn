<template>
  <div class="part">
    <div class="part2">
      <!-- static/img/关于我们/Bitmap.png       headerBig headerLittle twoYellow qrCode-->
      <img :src="headerBig.img" />
      <!-- static/img/关于我们/微信图片_20200108182644.png -->
      <div class="part2-p1">
        <!-- static/img/关于我们/微信图片_20200108182644.png -->
        <img :src="headerLittle.img" />
      </div>
    </div>
    <div class="part3">
      <!-- static/img/关于我们/“.png -->
      <div class="part3-p1">
        <img :src="twoYellow.img" />
      </div>
      <div class="part3-p2">
        <span>
          致力于打造一个“整合行业资源、提供潜水相关全方位 产品及服务”
          的综合服务型社区平台。致力于打造一个“整合行业资源、提供潜水相关
          全方位 产品及服务”的综合服务型社区平台。
        </span>
      </div>
    </div>
    <div class="part4">
      <!-- <img src = "static/img/03.28补图/微信图片_20200330183557.png"> -->
      <div class="part4-1">
        <div class="part4-1-p1">
          <span class="part4-font1">使命</span>
        </div>
        <div class="part4-1-p2">
          <span class="part4-font2">连接海洋，和热爱生活的你</span>
        </div>
      </div>
      <div class="part4-2">
        <div class="part4-2-zp1">
          <span class="part4-font1">愿景</span>
        </div>
        <div class="part4-2-zp2">
          <center>
            <span class="part4-font3">
              致力于打造一个“整合行业资源、提供潜水相关全方位
              产品及服务”的综合服务型社区平台。
            </span>
          </center>
        </div>
      </div>
      <div class="part4-2">
        <div class="part4-2-yp1">
          <span class="part4-font1">价值观</span>
        </div>
        <div class="part4-2-yp2">
          <span class="part4-font2">有结果 有洞察 有信任 有格局</span>
        </div>
      </div>
    </div>
    <div class="part5">
      <div class="part5-1">
        <!-- static/img/关于我们/Bitmap2.png -->
        <img :src="qrCode.img" />
      </div>
      <div class="part5-2">
        <span class="part5-2-font">扫描下载「一个关于潜水的内容异常多的神奇」app</span>
      </div>
      <div class="part5-3">
        <span class="part5-3-font">EnBlue APP 已于2018年12月和2019年3月在 APP STORE和 安卓应用商店上线！</span>
      </div>
    </div>

    <pagefooter></pagefooter>
  </div>
</template>
<script>
import pagefooter from "../pagebottom/pagefooter";
export default {
  components: {
    pagefooter: pagefooter
  },
  data() {
    return {
 
      headerBig: {
        img: "static/img/关于我们/Bitmap.png"
      },
      headerLittle: {
        img: "static/img/关于我们/微信图片_20200108182644.png"
      },
      twoYellow: {
        img: "static/img/关于我们/“.png"
      },
      qrCode: {
        img: "static/img/关于我们/Bitmap2.png"
      }
    };
  }
};
</script>
<style scoped>
.part {
  margin: 0 auto;
  width: 1440px;
  height: 1894px;
}
.part1 {
  margin: 0 auto;
  width: 1440px;
  height: 80px;
}

.part1-p1-p1 {
  margin-top: 22px;
  margin-bottom: 21px;
  margin-left: 150px;
  width: 111px;
  height: 37px;
  float: left;
}
.part1-p1-p2 {
  width: 34px;
  height: 22px;
  margin-left: 60px;
  margin-top: 29px;
  margin: 29px;
  float: left;
}
.part1-p1-p2-font {
  font-size: 16px;
  color: darkgray;
}
.part1-p1-p3 {
  width: 67px;
  height: 22px;
  margin-left: 60px;
  margin-top: 29px;
  margin-bottom: 29px;
  float: left;
}
.part1-p1-p3-font {
  font-size: 16px;
  color: black;
  font-style: bold;
}

.part1-p1-p4 {
  width: 17px;
  height: 17px;
  margin-left: 305px;
  margin-top: 29px;
  margin-bottom: 34px;
  float: left;
}
.part1-p1-p5 {
  width: 70px;
  height: 32px;
  margin-left: 40px;
  margin-top: 21px;
  border-radius: 20px;
  background-color: #6297b9;
  float: left;
}

.part1-p1-p5-p1-font {
  font-size: 14px;
  color: white;
  line-height: 32px;
  text-align: center;
  margin: 0 atuo;
  display: block;
}

.part1-p1-p6 {
  width: 34px;
  height: 34px;
  float: left;
  margin-left: 60px;
  margin-top: 20px;
  margin-bottom: 26px;
}
.part2 {
  width: 1440;
  height: 670;
  margin: 0 auto;
  position: relative;
}
.part2-p1 {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translateX(-50%) translateY(-50%);
}
.part3 {
  width: 1440;
  height: 356;
}
.part3-p1 {
  width: 48px;
  height: 42px;
  margin-top: 74px;
  margin-left: 696px;
}
.part3-p2 {
  width: 955px;
  height: 134px;
  margin-top: 24px;
  margin-left: 243px;
  font-size: 24px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 39px;
}
.part4 {
  width: 1440px;
  height: 388px;
  margin-top: 82px;
  margin: 0 auto;
  /* border-radius: 2000000px; */
  background-size: cover;
  /* background: rgba(248, 249, 250, 1); */
   background-image: url(/static/img/aboutUs/middleBck.png);
}
.part4-1 {
  width: 444px;
  height: 100%;
  margin-left: 54px;
  float: left;
}
.part4-2 {
  position: relative;
  width: 444px;
  height: 100%;
  float: left;
}
.part4-1-p1 {
  margin: 0 auto;
  margin-top: 121px;
  width: 50px;
  height: 33px;
}
.part4-font1 {
  line-height: 33px;
  color: #1b1b1b;
  font-size: 24px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
}
.part4-1-p2 {
  width: 199px;
  height: 22px;
  margin: 0 auto;
  margin-top: 27px;
}
.part4-font2 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 22px;
}
.part4-1-p3 {
  width: 3px;
  height: 189px;
  border: 1px #979797 solid;
}
.part4-2-zp1 {
  width: 50px;
  height: 33px;
  padding-top: 121px;
  margin: 0 auto;
}
.part4-2-zp2 {
  width: 260px;
  height: 86px;
  padding-top: 27px;
  margin: 0 auto;
}
.part4-font3 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 29px;
}
.part4-2-yp2 {
  width: 218px;
  height: 22px;
  padding-top: 27px;
  margin: 0 auto;
}
.part4-2-yp1 {
  width: 75px;
  height: 33px;
  padding-top: 121px;
  margin: 0 auto;
}

.part5 {
  width: 1440px;
  height: 404px;
}
.part5-1 {
  float: left;
  width: 189px;
  height: 189px;
  margin-top: 85px;
  margin-left: 336px;
}
.part5-2 {
  float: right;
  width: 471px;
  height: 30px;
  margin-top: 127px;
  margin-right: 410px;
}
.part5-2-font {
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 28px;
}
.part5-3 {
  float: right;
  width: 595px;
  height: 45px;
  margin-top: 36px;
  margin-right: 286px;
}
.part5-3-font {
  font-size: 16px;
  font-family: STSongti-SC-Light, STSongti-SC;
  font-weight: 300;
  color: rgba(99, 99, 99, 1);
  line-height: 22px;
}
</style>