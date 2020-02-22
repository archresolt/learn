<template>
  <div class="part0">
    <div class="part1">
      <el-input class = "font1"  placeholder="搜索产品名称/目的地" prefix-icon="el-icon-search" v-model="input2"></el-input>
    </div>
  </div>
</template>
<style scoped>
.font1{
    font-size:16px;
font-family:PingFangSC-Regular,PingFang SC;
font-weight:400;
color:rgba(179,179,179,1);
line-height:22px;
}
.part0 {
  width: 1440px;
  height: 126px;
  background: rgba(248, 249, 250, 1);
  margin: 0 auto;
}
.part1 {
  width: 536px;
  height: 46px;
  background: rgba(255, 255, 255, 1);
  border-radius: 23px;
  position: absolute;
  margin-left: 150px;
  margin-top: 40px;
}

.part1 {
  width: 536px;
  height: 46px;
  background: rgba(255, 255, 255, 1);
  border-radius: 23px;
}
</style>
<script>
export default {
  data() {
    return {
      input2: ""
    };
  }
};
</script>