<template>
  <!--可以通过设置checked为true或false-->
  <el-checkbox v-model="checked">备选项</el-checkbox>
</template>
<script>
export default {
  data() {
    return {
      checked: true
    };
  }
};
</script>