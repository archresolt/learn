<template>
  <div>
    <input type="text" v-model="swto" />
    <button @click ="shuchu">点击我</button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      swto: 1
    };
  },
  methods: {
      shuchu(){
          alert(this.swto)
      }
  },
};
</script>