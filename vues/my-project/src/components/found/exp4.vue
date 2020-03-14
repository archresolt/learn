<template>
<div>
  <!-- <div class="index indexbox">
    <div class="" -->

    <findgreatEquip ></findgreatEquip>

   
   <!-- 之前的练习 -->
    <!-- <div>
      <el-input v-model="appreance" placeholder="请输入你想说的" />
      <el-input placeholder="请输入你想说的" />
    </div>
    <br />
    <br />
    <div class="part0">
        <div class="part1">
      <span title="这是文字" :style = "{color:appreance}">文字的颜色可以改变</span>
        </div>
    </div> -->
   
   <!-- :a = "item" v-for ="item in equipments" :key = "item"  -->
  </div>
</template>
<style scoped>
@import "../../assets/css/findgreat_distance.css";
@import "../../assets/css/findgreat_boxsize.css";

.part0{
    width:300px;
    height: 30px;
    background: burlywood;
    position: relative;
}
.part1{
    position: absolute;
    top:0;
    left: 0;
    right:0;
    bottom:0;
    margin:auto;
    width:280px;
    height:28px;
        background:white;
}
</style>
<script>
import findgreatEquip from "../findgreat/findgreatEquip";
export default {
  components:{
findgreatEquip:findgreatEquip,
  },
  data() {
    return {
      appreance: "red"
    };
  }
};
</script>