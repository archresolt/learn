<template>
    <div>
        <!-- <el-input v-model="currentCity">
        </el-input> -->
        <!-- @click.stop="select('boat')" -->
        <button @click="currentCity = 'beijing'">
            装备
        </button>
         <button @click="jump('shanghai')">
            课程
        </button>
         <button @click="jump('chengdu')">
            预约
        </button>
         <button @click="jump('guangzhou')">
            美化
        </button>
        <div class="box" v-if="currentCity=='beijing'" key="beijing">
            北京
            <pagefooter></pagefooter>
        </div>
          <div class="box" v-if="currentCity=='shanghai'" key="shanghai">
              上海
             <div style="width:100px;height:50px;background:red"></div>
        </div>
          <div class="box" v-if="currentCity=='chengdu'" key="chengdu">
              成都
              <div style="width:200px;height:100px;background:blue;border-radius:50px">
              </div>
        </div>
          <div class="box" v-if="currentCity=='guangzhou'" key="guangzhou">
              广州
              <viewmore></viewmore>
        </div>
    </div>

</template>
<script>
import pagefooter from "../pagebottom/pagefooter";
import recommend from "../tripcomponents/recommend";
import popdestination from "../tripcomponents/popdestination";
import viewmore from "../tripcomponents/viewmore";
export default {
    data(){
        return{
            currentCity:"",

        }
    },
     components: {
             pagefooter: pagefooter,
             viewmore: viewmore,
             recommend: recommend,
              popdestination: popdestination,
     },
    methods:{
        change(){
      this.currentCity = this.key;
        },
        jump(city){
           this.currentCity = city; 
        }
    }
    
}
</script>
<style scoped>
.box{
    width:300px;
    height: 300px;
    margin-left: 30px;
    margin-top: 20px;
}
</style>