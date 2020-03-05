<template>
  <div class="part0">
    <div
      class="part1"
      v-for="(item,i) in contents"
      :key="i"
      @mouseenter.stop="setVisiable(i,true)"
      @mouseleave.stop="setVisiable(i,false)"
    >
      <img :src="item.pho" style="position:absolute;left:0;top:0;width:100%;height:100%;" />

      <div class="part1-1" :style="visiableStyle(i)">
        <div class="part1-1-1 font1">{{item.name}}</div>
        <div class="part1-1-2">￥{{item.price}}起/人</div>
        <div class="part1-1-10">
          <div class="img1">
            <img src="@/assets/image/检索切图/主题 copy.png" />
          </div>
          <span class="font3">{{item.type}} |</span>
          <div class="img2">
            <img src="@/assets/image/检索切图/Shape.png" />
          </div>
          <span class="font3">{{item.address}}</span>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  props: ["contents"],
  data() {
    return {
      visiables: [false, false, false]
    };
  },
  computed: {
    visiableStyle() {
      return i => {
        return {
          opacity: this.visiables[i] ? 0.5 : 0
        };
      };
    },
    visiable() {
      return i => {
        return this.visiables[i];
      };
    }
  },
  methods: {
    setVisiable(i, flag) {
      // this.visiables[i]=flag;
      this.$set(this.visiables, i, flag);
    }
  },
  //监听指定属性
  watch: {
    //等价于 this.$watch('visiables',()=>{})
    visiables() {
      console.log("visiables变化了");
    }
  },

  //下面是生命周期的钩子（hooker），钩子是说在特定生命周期时候执行的函数
  beforeCreate() {},
  created() {
    //这个阶段开始，可以使用data、computed、props里的数据，比如this.visiables
  },
  beforeMount() {},
  mounted() {
    //这个阶段开始，可以使用dom元素，比如this.$el，this.$refs
  },
  updated() {},
  beforeDestroy() {
    //这个阶段一般用于清理内存和监听
  },
  destroyed() {}
  //this.$emit,this.$on
};
</script>
<style scoped>
.font3 {
  font-size: 12px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 17px;
  margin-left: 10px;
  float: left;
}
.part1-1-10 {
  width: 260px;
  height: 17px;
  position: absolute;
  margin-top: -28px;
  margin-left: 14px;
}
.img1 {
  padding: 3px 11px 3px 10px;
  width: 7px;
  height: 11px;
  float: left;
}
.img2 {
  width: 11px;
  height: 10px;
  padding: 3px 11px 4px 10px;
  float: left;
}
.part1-3 {
  width: 270px;
  height: 24px;
}
.part1-4 {
  width: 270px;
  height: 20px;
}
.part0 {
  width: 1178px;
  height: 230px;
  margin: 0 auto;
  padding-top: 20px;
}
.part2 {
  width: 366px;
  height: 230px;
  float: left;
  margin-left: 20px;
}
.part1 {
  position: relative;
  width: 366px;
  height: 230px;
  float: left;
  margin-left: 20px;
}
.part1-1 {
  position: absolute;
  width: 366px;
  height: 136px;
  margin-top: 95px;
  background: rgba(0, 0, 0, 1);
  transition: opacity linear 0.2s;
}
.part1-1-1 {
  width: 328px;
  height: 52px;
  margin-top: 21px;
  margin-left: 14px;
  position: absolute;
}
.part1-1-2 {
  width: 98px;
  height: 30px;
  background: rgba(194, 119, 54, 1);
  margin-top: 86px;
  margin-left: 268px;
  font-size: 12px;
  font-family: FZLTHK--GBK1-0, FZLTHK--GBK1;
  font-weight: normal;
  color: rgba(255, 255, 255, 1);
  line-height: 30px;
}
.font1 {
  font-size: 16px;
  font-family: PingFangSC-Regular, PingFang SC;
  font-weight: 400;
  color: rgba(255, 255, 255, 1);
  line-height: 26px;
  text-align: left;
}
</style>
