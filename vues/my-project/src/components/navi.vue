<template>
  <!--这里是我的导航栏-->  
  <body>
    <div class="part">
        <div class="part1">

            <div class="part1-p1-p1">
                <img style="width:111px ; height:37px" src="@/assets/image/关于我们/Group.png" />
            </div>
            <div class="part1-p1-p2">
                <span @click="jump('/index/exp1','0')" :class="current==0?'part1-p1-p3-font':'part1-p1-p2-font'">
                  首页
                  </span>
            </div>
            <div class="part1-p1-p2">
                <span  @click="jump('/community/exp2','1')" :class ="current==1?'part1-p1-p3-font':'part1-p1-p2-font'">
                  社区
                  </span>
            </div>
            <div class="part1-p1-p2">
                <span @click="jump('/trip/exp3','2')" :class="current==2?'part1-p1-p3-font':'part1-p1-p2-font'">
                  行程
                  </span>
            </div>
            <div class="part1-p1-p2">
                <span   @click="jump('/found/exp4','3')" :class="current==3?'part1-p1-p3-font':'part1-p1-p2-font'">
                  发现
                  </span>
            </div>
            <div class="part1-p1-p3">
                <span   @click="jump('/Aboutus/exp5','4')" :class="current==4?'part1-p1-p3-font':'part1-p1-p2-font'">
                  关于我们
                  </span>
            </div>
            <div class="part1-p1-p4">
                <img style="width:17px ;height:17px" src="@/assets/image/关于我们/搜索.png">
            </div>

            <div class="part1-p1-p5">

                <span class="part1-p1-p5-p1-font">app</span>

            </div>
            <div class="part1-p1-p6"><img style="width:34px;height:34px"
                    src="@/assets/image/关于我们/30bc63b9c5cd41e497037363dfe231e5.png" /></div>
        </div>
 </div>
     </body>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: '欢迎大家 这是我的第一个vue界面 ',
      current:'1',
    }
  },
   methods: {

    jump(it,hi){
      this.$router.push(it)
      //方法体
      this.current = hi;
    },
    
  },

}
</script>


 <style scoped>
        .part {
            margin: 0 auto;
            width: 1440px;
            height: 80px;
            position: relative;
        }

        .part1 {
            margin: 0 auto;
            width: 1440px;
            height: 80px;
            background: rgba(255, 255, 255, 1);
            box-shadow: 0px 2px 4px 0px rgba(240, 240, 240, 0.5);

        }

        .part1-p1-p1 {
            margin-top: 22px;
            margin-bottom: 21px;
            margin-left: 150px;
            width: 111px;
            height: 37px;
            float: left;
        }

        .part1-p1-p2 {
            width: 34px;
            height: 22px;
            margin-left: 60px;
            margin-top: 29px;
            margin: 29px;
            float: left;
        }

        .part1-p1-p2-font {
            font-size: 16px;
            color: darkgray;
        }

        .part1-p1-p3 {
            width: 67px;
            height: 22px;
            margin-left: 60px;
            margin-top: 29px;
            margin-bottom: 29px;
            float: left;
        }

        .part1-p1-p3-font {
            font-size: 16px;
            color: black;
            font-style: bold;
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
            background-color: #6297B9;
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
