<template>
  <div class="part1">
    <div class="part1-1">
      <img :src="trip1.pho" width="270px" height="180px" />
      <!-- <img src="@/assets/image/检索切图/房子.png" width="270px" height="180px"> -->
    </div>
    <div class="part1-2">
       <span class="font1"> {{trip1.name}}</span>

        </div>
    <div class="part1-3">
        <div class="img1">
          <img src="@/assets/image/检索切图/Shape.png" />
        </div>
      <span class="font2">  {{trip1.address}}</span>
        </div>
    <div class="part1-4">
           <div class="img2">
          <img src="@/assets/image/检索切图/主题 copy.png" />
           </div>
      <span class="font3">{{trip1.type}}</span>
      <span class="font4">{{trip1.price}}</span>
    </div>
  </div>
</template>
<style scoped>
.font1 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 40px;
  float: left;
  margin-left: 11px;
}
.img1 {
    padding:5px 11px 8px 10px;
  width: 7px;
  height: 11px;
float: left;
  
}
.img2 {
  width: 11px;
  height: 10px;
padding:3px 11px 10px 10px;
float: left;
}


.font2 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(99, 99, 99, 1);
  line-height: 24px;
  float: left;
}
.font3 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 20px;
  float: left;
}
.font4 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(194, 119, 54, 1);
  line-height: 20px;
  float: left;
}
.part1 {
  width: 270px;
  height: 274px;
  float: left;
  margin-left: 20px;
}

.part1-1 {
  width: 270px;
  height: 180px;
}
.part1-2 {
  width: 270px;
  height: 40px;
  position: relative;
}
.part1-3 {
  width: 270px;
  height: 24px;
}
.part1-4 {
  width: 270px;
  height: 20px;
}
</style>
<script>
export default {
    props:['trip1'],
  data() {
    return {
    //   trip1: {
    //     name: "梅鲁利浮岛度假村",
    //     pho: "/static/img/房子.ed42443.png",
    //     address: "斐济/一级行政区/二级行政区",
    //     type: "度假村",
    //     price: "￥8766起/人"
    //   }
    };
  }
};
</script>