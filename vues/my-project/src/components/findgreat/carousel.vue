<template>
  <el-carousel indicator-position="outside" height="510px">
    <el-carousel-item v-for="(item,index) in topImgs" :key="index" style="width:100%;height:100%">
    <img :src = "item.img" style="width:100%;height:100%">
    
    </el-carousel-item>
  </el-carousel>
</template>
<script>
export default {
    props:['topImgs'],
}
</script>

<style>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 18px;
    opacity: 0.75;
    /* line-height: 300px; */
    margin: 0;
  }
  
  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }
  
  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>