<template>
<<<<<<< HEAD
  <div>
    <p :style="{'color':c,'background-color':b,'width':caiyu,'height':gaodu}"  :title="c">{{ c }}</p>
    <el-input v-model="c"></el-input>
    <el-input v-model="b"></el-input>
    <el-input v-model="caiyu"></el-input>
    <el-input v-model = "gaodu"></el-input>
    <img src = "static\img\关于我们\360截图20200131122717986.jpg"  v-show = "isshow" style="display:block"/>
    <button @click="hidden()"></button>
    <el-input v-model = "path"></el-input>
  </div>
</template>

=======
<div>
  <!-- <div class="index indexbox">
    <div class="" -->

    <findgreatEquip ></findgreatEquip>

   
   <!-- 之前的练习 -->
    <!-- <div>
      <el-input v-model="appreance" placeholder="请输入你想说的" />
      <el-input placeholder="请输入你想说的" />
    </div>
    <br />
    <br />
    <div class="part0">
        <div class="part1">
      <span title="这是文字" :style = "{color:appreance}">文字的颜色可以改变</span>
        </div>
    </div> -->
   
   <!-- :a = "item" v-for ="item in equipments" :key = "item"  -->
  </div>
</template>
<style scoped>
@import "../../assets/css/findgreat_distance.css";
@import "../../assets/css/findgreat_boxsize.css";

.part0{
    width:300px;
    height: 30px;
    background: burlywood;
    position: relative;
}
.part1{
    position: absolute;
    top:0;
    left: 0;
    right:0;
    bottom:0;
    margin:auto;
    width:280px;
    height:28px;
        background:white;
}
</style>
>>>>>>> d7e2d672f82cf3ee5ec33978b547611b2a5802ff
<script>
import findgreatEquip from "../findgreat/findgreatEquip";
export default {
<<<<<<< HEAD
    methods:{
     hidden(){
this.isshow = !this.isshow;
     }
    },
  data() {
    return {
      b: "blue",
      c: "red",
      caiyu:"200px",
      gaodu:"20px",
      path:"",
      isshow:true,
    };
  }
};
</script>

<style scoped>
.p2 {
  width: 200px;
  height: 30px;
}
</style>
=======
  components:{
findgreatEquip:findgreatEquip,
  },
  data() {
    return {
      appreance: "red"
    };
  }
};
</script>
>>>>>>> d7e2d672f82cf3ee5ec33978b547611b2a5802ff
