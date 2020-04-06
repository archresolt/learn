<template>
  <el-carousel :interval="4000" type="card" height="346px">
    <el-carousel-item v-for="(item,index) in shuffingImg" :key="index">
      <template>
        <el-row style="height:346px">
          <div style="width:100%;height:100%;border-radius:10px;overflow:hidden;">
          <img :src="item.img" style="width:100%;height:100%:" />
          </div>
        </el-row>
        <!-- 轮播的景点中的信息，包括名字，类型，价格，位置这些 -->
        <!-- <el-row style="height:200px">
          <el-col :span="1" style="height:150px; background:yellow" :offset="6"></el-col>
          <el-col :span="6" style="height:150px ; background:red"> -->
            <!--注意这里的写法，属性之间用分号隔开  -->
            <!-- <el-row style="height:70px ; background:blue"></el-row>
            <el-row style="height:70px; background:green"></el-row>
          </el-col>
          <el-col :span="2" style="height:70px ; background:yellow"></el-col>
          <el-row style="height:22px">
            <el-col :span="18" :offset="3" style="height:22px;"> -->
              <!-- <div style = "margin: 0 auto"> -->
              <div style="width:95px;height:22px;margin: 0 auto">
                <div class="lookmore">查看更多</div>
                <div style="width:26px;height:20px;float:left;">
                  <img src="/static/img/indexFirst/images1/xiangxia copy 2.png" />
                </div> 
               </div>
              <!-- </div>
            </el-col>
          </el-row>
        </el-row> -->
      </template>
    </el-carousel-item>
    <!-- <el-carousel-item>
         gsdfg
    </el-carousel-item>-->
  </el-carousel>
</template>
<script>
export default {
  props: ["shuffingImg"]
};
</script>
<style>
.el-carousel__item h3 {
  font-size: 14px;
  opacity: 0.75;
  /* height: 100%;
  width: 100%; */
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
}

.el-carousel__item:nth-child(2n + 1) {
}
</style>