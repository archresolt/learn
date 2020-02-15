<template>
  <div class="block">
    <el-slider v-model="value" range show-stops :max="10"></el-slider>
  </div>
</template>

<script>
export default {
  data() {
    return {
      value: [4, 8]
    };
  }
};
</script>