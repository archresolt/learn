<template>
  <div class="num">
    <div>
      1
      <slot name="one"></slot>
    </div>
    <div>
      2
      <slot name="two"></slot>
    </div>

    <div style="background:red">
      3
      <slot name="three"></slot>
    </div>
    <div>{{arr1.name}}</div>
  </div>
</template>
<script>
export default {
  props: ["arr1"]
};
</script>
<style scoped>
.num {
  width: 300px;
  height: 500px;
  background: lightblue;
}
</style>