<template>
  <div class="BigBox" style = "margin-top:-8px">
    <!-- <el-row class="boxOutSide"> -->
   
    <div class="boxOne1">
      <div class="text-1">连接海洋，和热爱生活的你</div>
      <div class="blueText-1">下载EnBlue app</div>
      <div class="erWei">
        <img src="static/img/appDownLoad/2wei.png" />
      </div>
      <div
        class="shangDian-1"
        style="text-align:left;"
      >EnBlue APP 已于2018年12月和2019年3月在 APP STORE和 安卓应用商店上线！</div>
    </div>

    <div class="boxOne2">
      <div class="img img-2">
        <img src="static/img/appDownLoad/活动.png" style="width:100%;height:100%" />
      </div>

      <div class="yuan yuan-2">
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-2">activity</div>
      <div class="text text-2">活动</div>
      <div class="des des-2">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne3">
      <div class="img img-3">
        <img src="static/img/appDownLoad/课程.png" style="width:100%;height:100%" />
      </div>

      <div class="yuan yuan-3">
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-3">content</div>
      <div class="text text-3">内容</div>
      <div class="des des-3">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne4">
      <div class="img img-4">
        <img src="static/img/appDownLoad/行程.png" style="width:100%;height:100%" />
      </div>

      <div class="yuan yuan-4">
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-4">trip</div>
      <div class="text text-4">行程</div>
      <div class="des des-4">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne5">
      <div class="img img-5">
        <img src="static\img\appDownLoad\装备.png" style="width:100%;height:100%" />
      </div>

      <div class="yuan yuan-5">
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-5">equipment</div>
      <div class="text text-5">装备</div>
      <div class="des des-5">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne6">
      <div class="img img-6">
        <img src="static\img\appDownLoad\课程.png" style="width:100%;height:100%" />
      </div>

      <div class="yuan yuan-6">
        <div style="margin-left:179px;float:left;margin-top:20px;">
          <span class="yuan6Text1">教学三部曲</span>
        </div>
        <div style="margin-left:40px;float:left;margin-top:15px;">
          <span class="yuan6Text2">入门/进阶/专业</span>
        </div>
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-6">course</div>
      <div class="text text-6">课程</div>
      <div class="des des-6">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne7">
      <div class="img img-7">
        <img src="static\img\appDownLoad\预约.png" />
      </div>

      <!-- <div class="yuan yuan-7"> -->
      <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      <!-- </div> -->
      <div class="name name-7">booking</div>
      <div class="text text-7">预约</div>
      <div class="des des-7">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne8">
      <div class="img img-8">
        <img src="static\img\appDownLoad\日志.png" />
      </div>

      <!-- <div class="yuan yuan-8"> -->
      <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      <!-- </div> -->
      <div class="name name-8">log</div>
      <div class="text text-8">日志</div>
      <div class="des des-8">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>

    <div class="boxOne9">
      <div class="img img-9">
        <img src="static\img\appDownLoad\美化.png" />
      </div>

      <div class="yuan yuan-9">
        <!-- <img src = "static/img/appDownLoad/2wei.png"> -->
      </div>
      <div class="name name-9">beautify</div>
      <div class="text text-9">美化</div>
      <div class="des des-9">潜水相关的行程在线浏览、咨询、预订及其他服务的在线旅游网站。</div>
    </div>
    <pagefooter style="margin-top:200px"></pagefooter>
  </div>
</template>
<script>
import pagefooter from "../pagebottom/pagefooter";
export default {
  components: {
    pagefooter: pagefooter
  }
};
</script>
<style scoped>
.img {
  width: 300px;
  height: 604px;
}
.text {
  width: 109px;
  height: 70px;
  font-size: 50px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 70px;
  letter-spacing: 4px;
}
.name {
  height: 70px;
  font-size: 50px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(216, 216, 216, 1);
  line-height: 70px;
  letter-spacing: 4px;
}
.des {
  width: 435px;
  height: 112px;
  font-size: 20px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 38px;
  text-align: left;
}
.yuan {
  background: rgba(98, 151, 185, 1);
  opacity: 0.2;
}
.BigBox {
  width: 1440px;
  height: 7283px;
  margin: 0 auto;
  background: rgba(255, 255, 255, 1);
  z-index: 200;
}

.boxOne1 {
  height: 750px;
  width: 1440px;

  background: blue;
  background-image: url(/static/img/appDownLoad/1.png);
}
.erWei {
  width: 206px;
  height: 206px;
  margin-top: 375px;
  margin-left: 501px;
  position: absolute;
}
.text-1 {
  position: absolute;
  margin-top: 233px;
  margin-left: 210px;
  width: 621px;
  height: 57px;
  font-size: 50px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 57px;
  letter-spacing: 1px;
}
.blueText-1 {
  position: absolute;
  margin-top: 465px;
  margin-left: 210px;
  width: 185px;
  height: 26px;
  font-size: 24px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 26px;
}
.shangDian-1 {
  position: absolute;
  margin-top: 643px;
  margin-left: 215px;
  width: 492px;
  height: 45px;
  font-size: 16px;
  font-family: STSongti-SC-Light, STSongti-SC;
  font-weight: 300;
  color: rgba(99, 99, 99, 1);
  line-height: 22px;
}

.boxOne2 {
  width: 1440px;
  height: 750px;
  /* margin:0 auto; */
  /* margin-left: 117px; */
  background: white;
}
.img-2 {
  position: absolute;
  margin-top: 87px;
  margin-left: 255px;
}
.text-2 {
  margin-top: 279px;
  margin-left: 748px;
  position: absolute;
}
.yuan-2 {
  margin-top: 308px;
  margin-left: 803px;
  position: absolute;
  width: 82px;
  height: 82px;
  border-radius: 41px;
}
.name-2 {
  margin-top: 301px;
  margin-left: 826px;
  position: absolute;
  width: 206px;
}
.des-2 {
  margin-top: 413px;
  margin-left: 748px;
  position: absolute;
}

.boxOne3 {
  width: 1440px;
  height: 750px;
  background: rgba(248, 249, 250, 1);
}
.img-3 {
  position: absolute;
  margin-top: 87px;
  margin-left: 855px;
}
.text-3 {
  margin-top: 139px;
  margin-left: 285px;
  position: absolute;
}
.yuan-3 {
  width: 149px;
  height: 149px;
  border-radius: 74px;
  margin-top: 314px;
  margin-left: 800px;
  position: absolute;
}
.name-3 {
  margin-top: 158px;
  margin-left: 360px;
  position: absolute;
}
.des-3 {
  margin-top: 250px;
  margin-left: 285px;
  position: absolute;
}

.boxOne4 {
  width: 1440px;
  height: 750px;
  background-image: url("/static/img/appDownLoad/xingChengBei.png");
  background-repeat: no-repeat;
}
.des-4 {
  margin-left: 787px;
  margin-top: 298px;
  position: absolute;
}
.name-4 {
  width: 98px;
  height: 70px;
  /* font-size:50px */
  margin-left: 829px;
  margin-top: 104px;
  position: absolute;
}
.text-4 {
  margin-left: 746px;
  margin-top: 75px;
  position: absolute;
}

.img-4 {
  margin-top: -45px;
  margin-left: 255px;
  position: absolute;
}
.yuan-4 {
  position: absolute;
  margin-left: 678px;
  margin-top: 39px;
  width: 109px;
  height: 109px;
  border-radius: 54px;
}

.boxOne5 {
  width: 1440px;
  height: 750px;
  /* background-image: url("/static/img/appDownLoad/xingChengBei.png"); */
  /* background-repeat: no-repeat; */
}
.des-5 {
  margin-left: 285px;
  margin-top: 398px;
  position: absolute;
}
.name-5 {
  width: 298px;
  height: 70px;
  /* font-size:50px */
  margin-left: 361px;
  margin-top: 200px;
  position: absolute;
}
.text-5 {
  margin-left: 285px;
  margin-top: 170px;
  position: absolute;
}

.img-5 {
  margin-top: 50px;
  margin-left: 855px;
  position: absolute;
}
.yuan-5 {
  position: absolute;
  margin-left: 437px;
  margin-top: 280px;
  width: 184px;
  height: 184px;
  border-radius: 92px;
}

.boxOne6 {
  width: 1440px;
  height: 750px;
  /* background-image: url("/static/img/appDownLoad/xingChengBei.png"); */
  /* background-repeat: no-repeat; */
}
.des-6 {
  margin-left: 735px;
  margin-top: 398px;
  position: absolute;
}
.name-6 {
  width: 186px;
  height: 70px;
  /* font-size:50px */
  margin-left: 808px;
  margin-top: 200px;
  position: absolute;
}
.text-6 {
  margin-left: 734px;
  margin-top: 170px;
  position: absolute;
}

.img-6 {
  margin-top: 55px;
  margin-left: 255px;
  position: absolute;
}
.yuan-6 {
  position: absolute;
  margin-left: 529px;
  margin-top: 255px;
  width: 580px;
  height: 57px;
  background: rgb(156, 195, 219);
  border-radius: 29px;
  /* opacity: 0.2; */
}
.yuan6Text1 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color:black;
  line-height: 22px;
  letter-spacing: 2px;
}
.yuan6Text2 {
  font-size: 28px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 22px;
  letter-spacing: 2px;
}

.boxOne7 {
  width: 1440px;
  height: 750px;
  /* background-image: url("/static/img/appDownLoad/xingChengBei.png"); */
  /* background-repeat: no-repeat; */
}
.des-7 {
  margin-left: 220px;
  margin-top: 398px;
  position: absolute;
}
.name-7 {
  width: 298px;
  height: 70px;
  /* font-size:50px */
  margin-left: 292px;
  margin-top: 200px;
  position: absolute;
}
.text-7 {
  margin-left: 285px;
  margin-top: 170px;
  position: absolute;
}

.img-7 {
  margin-top: -80px;
  margin-left: 855px;
  position: absolute;
}
.yuan-7 {
  position: absolute;
  margin-left: 437px;
  margin-top: 280px;
  width: 184px;
  height: 184px;
  border-radius: 92px;
}

.boxOne8 {
  width: 1440px;
  height: 750px;
  /* background-image: url("/static/img/appDownLoad/xingChengBei.png"); */
  /* background-repeat: no-repeat; */
}
.des-8 {
  margin-left: 750px;
  margin-top: 398px;
  position: absolute;
}
.name-8 {
  width: 88px;
  height: 70px;
  /* font-size:50px */
  margin-left: 836px;
  margin-top: 200px;
  position: absolute;
}
.text-8 {
  margin-left: 750px;
  margin-top: 170px;
  position: absolute;
}

.img-8 {
  margin-top: 0px;
  margin-left: 36px;
  position: absolute;
}
.yuan-8 {
  position: absolute;
  margin-left: 437px;
  margin-top: 280px;
  width: 184px;
  height: 184px;
  border-radius: 92px;
}

.boxOne9 {
  width: 1440px;
  height: 750px;
  /* background-image: url("/static/img/appDownLoad/xingChengBei.png"); */
  /* background-repeat: no-repeat; */
  background: rgba(248, 249, 250, 1);
}
.des-9 {
  margin-left: 220px;
  margin-top: 416px;
  position: absolute;
}
.name-9 {
  width: 227px;
  height: 70px;
  /* font-size:50px */
  margin-left: 292px;
  margin-top: 243px;
  position: absolute;
}
.text-9 {
  margin-left: 220px;
  margin-top: 222px;
  position: absolute;
}

.img-9 {
  margin-top: 73px;
  margin-left: 885px;
  position: absolute;
}
.yuan-9 {
  position: absolute;
  margin-left: 372px;
  margin-top: 324px;
  width: 184px;
  height: 184px;
  border-radius: 92px;
}
</style>