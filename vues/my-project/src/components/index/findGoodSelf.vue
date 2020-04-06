<template>
  <div class="findGoodSelfBox">
    <el-row class="text1Box">
      <div class="text1LittleBox">{{findGoodFrom.text1}}</div>
    </el-row>
    <el-row style="height:21px">
      <div class="line"></div>
    </el-row>
    <el-row style="height:92px">
      <div class="textThree">
        <h6 style="display:block">{{findGoodFrom.text2}}</h6>
        <h6 style="display:block">{{findGoodFrom.text3}}</h6>
        <h6 style="display:block">{{findGoodFrom.text4}}</h6>
      </div>
    </el-row>

    <!-- 图片 -->
    <el-row style="height:124px;margin-top:60px">
      <div class="img">
        <img :src="findGoodFrom.img" style="width:100%;height:100%" />
      </div>
    </el-row>
  </div>
</template>
<script>
export default {
  props: ["findGoodFrom"]
};
</script>
<style scoped>
.findGoodSelfBox {
  margin-top: 42px;
  width: 275px;
  height: 554px;
  /* background:rgba(255,255,255,1); */
  background: rgba(67, 104, 127, 1);
  /* box-shadow:0px 2px 20px 0px rgba(143,143,143,0.5); */
  border-radius: 10px;
  margin-left: 68px;
  float: left;
  color: rgba(255, 255, 255, 1);
  transition: background 0.2s linear, color 0.25s linear;
}
.findGoodSelfBox:hover {
  background: rgba(255, 255, 255, 1);
  box-shadow: 0px 2px 20px 0px rgba(143, 143, 143, 0.5);
  color: rgba(27, 27, 27, 1);
}
.text1Box {
  height: 33px;
  margin-top: 112px;
}
.text1LittleBox {
  width: 50px;
  height: 33px;
  font-size: 24px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  /* color:rgba(255,255,255,1); */
  line-height: 33px;
  text-align: left;
  float: left;
  margin-left: 45px;
}
.line {
  width: 42px;
  height: 3px;
  background: #ffffff;
  margin-left: 45px;
  margin-top: 9px;
}
.textThree {
  width: 179px;
  height: 92px;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  /* color:rgba(27,27,27,1); */
  line-height: 30px;
  text-align: left;
  margin-left: 45px;
}
.img {
  width: 185px;
  height: 124px;
  margin-left: 45px;
}
</style>