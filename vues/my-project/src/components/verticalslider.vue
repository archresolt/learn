<template>
  <div class="block">
    <el-slider v-model="value" vertical height="200px"></el-slider>
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