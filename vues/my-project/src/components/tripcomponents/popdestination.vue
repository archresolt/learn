<template>
  <div class="part0">
    <div class="part1">
      <!-- @/assets/image/行程首页切图/茅草我.png -->
      <img :src = "trip1.pho" width="366px" height="230px" />
    </div>
    <div class="part2">{{trip1.name}}</div>
    <div class="part3">
      <div class="part3-1">
        <img src="@/assets/image/检索切图/主题 copy.png" />
      </div>
      <span class="font1">{{trip1.type}}</span>
      <span class="font2">{{trip1.price}}</span>
    </div>
  </div>
</template>
<style scoped>
.part0 {
  width: 366px;
  height: 340px;
  margin-left: 20px;
    float: left;
}
.part1 {
  width: 366px;
  height: 230px;
}
.part2 {
  width: 350px;
  height: 50px;
  padding: 12px 9px 12px 7px;
  font-size: 18px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 25px;
  text-align: left;
}
.part3 {
  width: 366px;
  height: 36px;
}
.font1 {
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(144, 144, 144, 1);
  line-height: 36px;
  float: left;
   margin-left: 10px;
}
.font2 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(194, 119, 54, 1);
  line-height: 36px;
  float: left;
  margin-left: 7px;
}
.part3-1 {
  width: 12.66px;
  padding-top: 11px;
  padding-left: 12px;
  height: 12.14px;
  float: left;
}
</style>
<script>

export default {
    props:['trip1'], 
  data() {
    return {
    //   trip1: {
    //     pho: "/static/img/茅草我.d2724ed.png",
    //     name: "泰国·甲米·兰塔和谐旅馆 | 丰富水下生物 探秘水下沉船",
    //     type: "度假村｜",
    //     price: "￥8766起/人"
    //   }
     
    };
  }
};
</script>