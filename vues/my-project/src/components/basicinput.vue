<!--为什么大小设置没有用哦-->
<template>
  <div sytle="width:200px height:40px">
    <el-input v-model="input" placeholder="请输入内容"></el-input>
  </div>
</template>


<script>
export default {
  data() {
    return {
      input: ""
    };
  }
};
</script>