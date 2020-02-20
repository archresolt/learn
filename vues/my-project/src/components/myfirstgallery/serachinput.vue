<template>
    <div class="part0"> 

<div class="part1">

  <el-input 
    placeholder="请输入内容"
    prefix-icon="el-icon-search"
    v-model="input2">
  </el-input>


</div>
    </div>
</template>
<style scoped>
.part0{
    width:1440px;
height:537px;
background:rgba(248,249,250,1);
margin:  0 auto;
}
.font1{

}
.part1{
       width:536px;
height:46px;
background:rgba(255,255,255,1);
border-radius:23px;
position: absolute;
margin-left: 150px;
margin-top: 40px;
}
</style>
<script>
export default {
  data() {
    return {
 
      input2: '',
     
    }
  }
}
</script>