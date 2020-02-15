<template>
  <div class="block">
    <el-slider v-model="value" show-input></el-slider>
  </div>
</template>

<script>
export default {
  data() {
    return {
      value: 0
    };
  }
};
</script>