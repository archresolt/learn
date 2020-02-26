<template>
  <div class="part2">
    <div class="part2-1">
      <span class="part2-font1">{{trip1.text1}}</span>
    </div>
    <div class="part2-2">
      <img :src="trip1.img1" />
      <!-- ../../assets/image/社区首页1/“ copy 3.png -->
    </div>
    <div class="part2-3">
      <span class="part2-font2">{{trip1.text2}}</span>
    </div>
    <div class="part2-4">
      <span class="part2-font3">{{trip1.text3}}</span>
    </div>
    <div class="part2-5">
      <img :src="trip1.img2" />
      <!-- <img src="@/assets/image/社区首页2/126866_banner.png" /> -->
    </div>
    <div class="part2-6"></div>

    <div class="part2-8">
      <span class="part2-font4">{{trip1.text4}}</span>
    </div>
    <div class="part2-9">
      <span class="part2-font5">{{trip1.text51}}</span>
      <br />
      <span class="part2-font5">{{trip1.text52}}</span>
      <br />
      <span class="part2-font5">{{trip1.text53}}</span>
    </div>
    <div class="part2-10"></div>
    <div class="part2-11">
      <span class="part2-font4">{{trip1.text4}}</span>
    </div>
    <div class="part2-12">
      <span class="part2-font5">{{trip1.text61}}</span>
      <br />
      <span class="part2-font5">{{trip1.text62}}</span>
      <br />
      <span class="part2-font5">{{trip1.text63}}</span>
    </div>
    <div class="part2-13">
      <span class="part2-font6">{{trip1.text7}}</span>
    </div>
    <div class="part2-14">
      <span class="part2-font7">{{trip1.text8}}</span>
    </div>
    <div class="part2-15">
      <span class="part2-font7">{{trip1.text9}}</span>
    </div>
  </div>
</template>
<style scoped>
.part2 {
  width: 830px;
  height: 1199px;
  margin-top: 60px;
  margin-left: 150px;
  position: relative;
  float: left;
  background: white;
}

.part2-1 {
  position: absolute;
  margin-top: 30px;
  margin-left: 30px;
  width: 359px;
  height: 33px;
}

.part2-2 {
  position: absolute;
  margin-top: 87px;
  margin-left: 30px;
  width: 11px;
  height: 10px;
}

.part2-3 {
  position: absolute;
  margin-top: 83px;
  margin-left: 45px;
  width: 102px;
  height: 16px;
}

.part2-4 {
  position: absolute;
  margin-top: 139px;
  margin-left: 30px;
  width: 751px;
  height: 60px;
  background: rgba(244, 245, 247, 1);
  border-radius: 8px;
  padding: 26px 10px 34px 9px;
}

.part2-5 {
  position: absolute;
  margin-top: 279px;
  margin-left: 30px;
  width: 770px;
  height: 229px;
}

.part2-6 {
  position: absolute;
  margin-top: 561px;
  margin-left: 30px;
  width: 2px;
  height: 24px;
  background: #6297b9;
}

.part2-8 {
  position: absolute;
  margin-top: 558px;
  margin-left: 47px;
  width: 734px;
  height: 29px;
}

.part2-9 {
  position: absolute;
  margin-top: 607px;
  margin-left: 30px;
  width: 770px;
  height: 255px;
}

.part2-10 {
  position: absolute;
  margin-top: 915px;
  margin-left: 30px;
  width: 2px;
  height: 24px;
  background: #c27736;
}

.part2-11 {
  position: absolute;
  margin-top: 912px;
  margin-left: 49px;
  width: 734px;
  height: 29px;
}

.part2-12 {
  position: absolute;
  margin-top: 961px;
  margin-left: 30px;
  width: 770px;
  height: 130px;
}

.part2-13 {
  position: absolute;
  margin-top: 1166px;
  margin-left: 662px;
  width: 25px;
  height: 17px;
}

.part2-14 {
  position: absolute;
  margin-top: 1169px;
  margin-left: 689px;
  width: 23px;
  height: 12px;
}

.part2-15 {
  position: absolute;
  margin-top: 1169px;
  margin-left: 728px;
  width: 72px;
  height: 12px;
}
.part2-font1 {
  font-size: 24px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(27, 27, 27, 1);
  line-height: 33px;
}

.part2-font2 {
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 16px;
}

.part2-font3 {
  font-size: 20px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(99, 99, 99, 1);
  line-height: 32px;
}

.part2-font4 {
  font-size: 18px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 500;
  color: rgba(99, 99, 99, 1);
  line-height: 28px;
}

.part2-font5 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 32px;
}

.part2-font6 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 17px;
}

.part2-font7 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 12px;
}
</style>
<script>
export default {
  props: ["trip1"],
  data() {
    return {};
  }
};
</script>