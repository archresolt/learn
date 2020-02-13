<template>
  <div class="hello">
    <router-link to="/">我跳转到根目录</router-link>
   <ti></ti>
   <span>这是我的第一个组件</span>
   <button @click="jump('/')">我跳转到根目录</button>
    <button @click="jump('/hello')">我跳转到另外一个目录</button>
  </div>

</template>

<script>
import ele from "./ele";
export default {
  components: { ti: ele },
  name: "HelloWorld",
  data() {
    return {
      msg: "设计费时间雷锋精神龙卷风 "
    };
  },
  methods: {
    jump(it){
      this.$router.push(it)
      //方法体
    }
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
