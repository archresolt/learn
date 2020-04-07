<template>
  <div class="hello">
    <el-table :data="tableData" style="width:100%">
      <el-table-column prop="date" label="日期" width="180"></el-table-column>
      <el-table-column prop="name" label="姓名" width="180"></el-table-column>
      <el-table-column prop="address" label="地址" width="180"></el-table-column>
    </el-table>

    <el-button @click="refershtable()">刷新列表</el-button>
    <el-button @click>增加一个列</el-button>
    <el-button @click>删除一个列</el-button>
    <el-button @click>修改数据</el-button>

    <copText :arr1="lastName1"></copText>

    <copText :arr1="lastName2">
      <el-input v-model="lastName3.name" slot="two"></el-input>
      <el-button slot="one">check</el-button>
    </copText>

    <copText :arr1="lastName3">
      <!-- 在这里由于子组件中定义的都是具名插槽，因此没有默认插槽了，下面的内容也是不显示的 -->
      {{lastName1}}
      <div slot="three">我想出现在第三个插槽里面   {{lastName2}}</div>
      </copText>
  </div>
</template>

<script>
import copText from "../components/tripcomponents/copText";
const a = 1;
export default {
  components: {
    copText: copText
  },
  data() {
    return {
      tableData: [{ name: "wade" }, { name: "jams" }, { name: "tom" }],
      lastName1: { name: "kebi" },
      lastName2: { name: "jodran" },
      lastName3: { name: "zhouqi" }
    };
  },
  created() {
    this.refershtable();
  },
  methods: {
    refershtable() {
      axios.post("/api/getTableData").then(abc => {
        this.tableData = abc.data;
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
