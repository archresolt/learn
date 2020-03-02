<template>
  <div class="hello">
    <h1>{{ msg }}</h1>名称：
    <el-input v-model="name"></el-input>年龄：
    <el-input v-model="age"></el-input>
    <el-button @click="save">保存</el-button>
    <hr />
    <el-button @click="refresh">刷新</el-button>
    <div>
      {{
      userList
      }}
    </div>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  data() {
    return {
      msg: "欢迎大家 这是我的第一个vue界面 ",
      name: null,
      age: null,
      userList: []
    };
  },
  methods: {
    refresh() {
      axios
        .post("/api/hgetall", { key: "userList" })
        .then(resp => {
          this.userList = resp.data;
        })
        .catch(resp => {
          console.error(resp);
        });
    },
    save() {
      //axios在main.js里引入，并且注册到了全局window下
      //axios.get('/api')意思是访问http://localhost:8080/api，该api在config/index.js里配置为访问localhost:3001端口，也就是npm run server启动的服务器
      axios
        .post("/api/hset", {
          key: "userList",
          field: this.name,
          data: {
            name: this.name,
            age: this.age
          }
        })
        .then(resp => {
          if (resp.data.errcode) {
            this.alert(resp.data.msg);
          } else {
            this.$notify({
              title: "提示",
              message: "保存成功",
              duration: 0
            });
          }
        })
        .catch(resp => {
          console.error(resp);
        });
    }
  }
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
