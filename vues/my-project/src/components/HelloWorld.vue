<template>
  <div class="hello">
    <el-table :data="tableData" style="width:100%">
      <el-table-column prop="date" label="日期" width="180"></el-table-column>
      <el-table-column prop="name" label="姓名" width="180"></el-table-column>
      <el-table-column prop="address" label="地址" width="180"></el-table-column>
    </el-table>

    <el-button @click="refershtable()">刷新列表</el-button>
      <el-button @click="">增加一个列</el-button>
      <el-button @click="">删除一个列</el-button>
         <el-button @click="">修改数据</el-button>
  </div>
</template>

<script>
const a = 1;
export default {
  data(){
    return{
      tableData:[
      
      ]
    }
  },
created(){
this.refershtable();
},
  methods:{
    refershtable(){
      axios
      .post("/api/getTableData")
      .then(abc =>{
        this.tableData = abc.data ;
      })
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
