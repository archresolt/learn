<template>
<!--这里是我的导航栏-->

<body>
  <div class="part">
    <div class="part1">
      <div class="part1-p1-p1">
        <img style="width:111px ; height:37px" src="@/assets/image/关于我们/Group.png" />
      </div>
      <div class="part1-p1-p2">
        <span
          @click="jump('/index/expindex','0')"
          class="part1-p1-p2-font"
          :class="naviItemClass('/index/expindex')"
        >首页</span>
      </div>
      <div class="part1-p1-p2">
        <span
          @click="jump('/community','1')"
          class="part1-p1-p2-font"
          :class="naviItemClass('/community')"
        >社区</span>
      </div>
      <div class="part1-p1-p2">
        <span @click="jump('/trip/exp3','2')"
           class="part1-p1-p2-font"
         :class="naviItemClass('/trip/exp3')">行程</span>
      </div>
      <div class="part1-p1-p2">
        <span
          @click="jump('/found/exp4','3')"
             class="part1-p1-p2-font"
          :class="naviItemClass('/found/exp4')"
        >发现</span>
      </div>
      <div class="part1-p1-p3">
        <span
          @click="jump('/Aboutus/exp5','4')"
             class="part1-p1-p2-font"
          :class="naviItemClass('/Aboutus/exp5')"
        >关于我们</span>
      </div>
      <div class="part1-p1-p4">
        <img style="width:17px ;height:17px" src="@/assets/image/关于我们/搜索.png" />
      </div>

      <div class="part1-p1-p5" @click="jump('/jieShaoYe')">
        <span class="part1-p1-p5-p1-font">app</span>
      </div>
      <div class="part1-p1-p6" @click="openLogin()">
        <img
          style="width:34px;height:34px"
          src="@/assets/image/关于我们/30bc63b9c5cd41e497037363dfe231e5.png"
        />
      </div>
    </div>
  </div>
</body>
</template>

<script>
export default {
  name: "HelloWorld",

  computed: {
    naviItemClass() {
      return key => {
        //当当前路由是首页路由的时候，所有路由的导航按钮的字体为白色
        //在当下路由路径下的对应导航按钮中的字体加粗
        let result = {};
        if (this.$route.path == "/index/expindex") {
            result.whiteFont =true;
            };
        if (this.$route.path== key) {
            result.boldFont =true;
        }

        return result;
      };
    }
  },
  data() {
    return {
      msg: "欢迎大家 这是我的第一个vue界面 ",
      current: "1",
      currentRoute: null
    };
  },
  mounted() {
    this.currentRoute = this.$route.path;
  },
  watch: {
    $route(value, old) {
      this.currentRoute = value.path;
    }
  },

  methods: {
    openLogin() {
      //根節點發起login事件
      this.$root.$emit("login", true);
    },
    jieShao() {
      //根节点发起regist事件
      this.$root.$emit("intrduce", true);
    },
    jump(path, number) {
      this.$router.push(path);
      //方法体
      this.current = number;
      console.log(this.$router);
    }
  }
};
</script>

<style scoped>
.part {
  margin: 0 auto;
  width: 1440px;
  height: 80px;
  position: relative;
  z-index: 1;
  opacity: 0.8;
}

.part1 {
  margin: 0 auto;
  width: 1440px;
  height: 80px;
  /* background: rgba(255, 255, 255, 1); */
  /* box-shadow: 0px 2px 4px 0px rgba(240, 240, 240, 0.5); */
}

.part1-p1-p1 {
  margin-top: 22px;
  margin-bottom: 21px;
  margin-left: 150px;
  width: 111px;
  height: 37px;
  float: left;
  z-index: 10;
  opacity: 0.9;
}

.part1-p1-p2 {
  width: 34px;
  height: 22px;
  margin-left: 60px;
  margin-top: 29px;
  margin: 29px;
  float: left;
  cursor: default;
}

.part1-p1-p2-font {
  font-size: 16px;
  color:black;
}

.boldFont {
  font-weight: bold;
}
.whiteFont{
color: white;
}
.part1-p1-p3 {
  width: 67px;
  height: 22px;
  margin-left: 60px;
  margin-top: 29px;
  margin-bottom: 29px;
  float: left;
  cursor: default;
}


.part1-p1-p4 {
  width: 17px;
  height: 17px;
  margin-left: 305px;
  margin-top: 29px;
  margin-bottom: 34px;
  float: left;
}

.part1-p1-p5 {
  width: 70px;
  height: 32px;
  margin-left: 40px;
  margin-top: 21px;
  border-radius: 20px;
  background-color: #6297b9;
  float: left;
}

.part1-p1-p5-p1-font {
  font-size: 14px;
  color: white;
  line-height: 32px;
  text-align: center;
  margin: 0 atuo;
  display: block;
}

.part1-p1-p6 {
  width: 34px;
  height: 34px;
  float: left;
  margin-left: 60px;
  margin-top: 20px;
  margin-bottom: 26px;
}
</style>
