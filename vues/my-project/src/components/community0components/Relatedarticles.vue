<template>
  <div class="part3">
    <div class="part3-1">
      <div class="part3-1-1">
        <span class="part3-font1">{{trip2.text1}}</span>
      </div>
    </div>
    <div class="part3-2">
      <img :src="trip2.img1" />
    </div>
    <div class="part3-3">
      <span class="part3-font2">{{trip2.text2}}</span>
    </div>
    <div class="part3-2">
      <img :src="trip2.img2" />
    </div>
    <div class="part3-3">
      <span class="part3-font3">{{trip2.text3}}</span>
    </div>
    <div class="part3-2">
      <img :src="trip2.img1" />
    </div>
    <div class="part3-3">
      <span class="part3-font2">{{trip2.text2}}</span>
    </div>
    <div class="part3-2">
      <img :src="trip2.img2" />
    </div>
    <div class="part3-3">
      <span class="part3-font2">{{trip2.text3}}</span>
    </div>
  </div>
</template>
<style scoped>
.part3 {
  background: white;
  width: 288px;
  height: 1210px;
  margin-top: 60px;
  margin-left: 22px;
  position: relative;
  float: left;
}

.part3-1 {
  width: 288px;
  height: 116px;
  float: left;
  position: relative;
}

.part3-1-1 {
  position: absolute;
  width: 72px;
  height: 22px;
  margin-top: 50px;
  margin-left: 108px;
}

.part3-2 {
  position: relative;
  width: 186px;
  height: 186px;
  margin-left: 51px;
  float: left;
}

.part3-3 {
  position: relative;
  width: 186px;
  height: 48px;
  margin-left: 51px;
  margin-top: 5px;
  margin-bottom: 30px;
  float: left;
}

.part3-font1 {
  font-size: 16px;
  font-family: PingFangSC-Medium, PingFang SC;
  font-weight: 600;
  color: rgba(27, 27, 27, 1);
  line-height: 22px;
}

.part3-font2 {
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 22px;
}

.part3-font3 {
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 22px;
  text-decoration: underline;
}
</style>
<script>
export default {
  props: ["trip2"]
};
</script>