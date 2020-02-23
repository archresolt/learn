<template>
  <div class="part0">
    <div class="part1">
      <span class="font1">{{textinserts.name}}</span>
    </div>
    <!-- <div class="part2">
<span class="font2" >298</span>
    <span class="font3" >行程</span>-->
    <!-- </div> -->
  </div>
</template>
<style scoped>
.part0 {
  width: 1440px;
  height: 170px;
  margin: 0 auto;
}
.part1 {
  width: 200px;
  height: 40px;
  margin-top: 80px;
  margin-left: 150px;
  position: absolute;
}
.font1 {
  font-size: 28px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(27, 27, 27, 1);
  line-height: 40px;
  float: left;
}
.part2 {
  width: 70px;
  height: 25px;
  margin-top: 51px;
  margin-left: 313px;
  position: absolute;
}
.font2 {
  font-size: 18px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(98, 151, 185, 1);
  line-height: 25px;
}
.font3 {
  color: #1b1b1b;
  font-size: 14px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  line-height: 25px;
}
</style>
<script>
export default {
  props: ["textinserts"]
};
</script>