<template>
  <div>
    <div class="part0">
      <photext :trip1="photext1"></photext>
      <Relatedarticles :trip2="retartic"></Relatedarticles>
      <messageboard></messageboard>
    </div>
    <!-- <messageboard></messageboard> -->
  </div>
</template>
<style scoped>
.part0 {
  width: 1440px;
  height: 1750px;
  margin: 0 auto;
  background: rgba(248, 249, 250, 1);
}
</style>
<script>
import photext from "../community0components/photext";
import Relatedarticles from "../community0components/Relatedarticles";
import messageboard from "../community0components/messageboard";
export default {
  components: {
    photext: photext,
    Relatedarticles: Relatedarticles,
    messageboard: messageboard
  },
  data() {
    return {
      photext1: {
        text1: "西太平洋中有一个上帝的水族箱",
        text2: "装备，业内新闻",
        text3:
          "古人说仁者乐山，智者乐水，像开水酱这么冰雪聪明的人当然是喜欢水的，我最喜欢的旅行就是海岛旅行。",
        text4:
          "古人说仁者乐山，智者乐水，像开水酱这么冰雪聪明的人当然是喜欢水的。",
        text51:
          "今天就要给你们推荐一个地方，即没有马尔代夫贵，然后又比普吉岛人少很多，那就是有着上帝的水族箱之称的美丽的帕劳。重点是帕劳对我们中国实现的是免签政策，只要我们护照上有三页空白页，我们就能说走就走啦。",
        text52:
          "帕劳是西太平洋中的一个岛国，台湾地区称为帛琉，小得几乎在Google地图上看不见，它位于菲律宾以东500公里，由一个大堡礁和无数小岛还有少数堡礁构成。帕劳全国有三分之二的人口在旧都科罗尔居住，支柱产业为渔业和旅游业，是一个富裕的小国。 ",
        text53:
          " 从中国大陆到帕劳，目前没有直飞，都需要到澳门、香港或台湾转机。开水酱地处便利的广东，所以上次去的时候选择了性价比最高的澳门飞帕劳。",
        text61:
          " 作为开水有文的老粉丝，可能会觉得，我们好像没有推出过什么行程让大家有一次面基的机会。但是因为你们是开水有文最可爱的小粉丝，所以你们提的需求，我们都记在心里。",
        text62: "这次就让你和开水有文的其他粉丝有一次约伴潜水的机会。",
        text63: "对的，这次我们要带你去如诗如画的帕劳。",
        text7: "浏览",
        text8: "792",
        text9: "2018-08-14",
        img1:
          "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAICAYAAADA+m62AAAAAXNSR0IArs4c6QAAAERlWElmTU0AKgAAAAgAAYdpAAQAAAABAAAAGgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAACqADAAQAAAABAAAACAAAAABBuOuVAAAA5klEQVQYGTWQvwqCUBTG772GSxRO1gu0BTUFbS0NjTW4FI7ZkNIb9Arq1OIYhGNThFD0ZwzH1jZfwBoisO9c9cDH8fud7xxRzoryfb+XZdlOCLGybXtP2HXdDee87zhOV5RBhNZQU1XViJjneW2E5tAFymQQsIXZCOBqWdaHglhaQhyPB/LlxQVBlLwWBEENsxn00zTtjM5EGIYK+lQaIW7U0zSdoFWxGJum+ZazJEmGuNaA+eq6/iCIkovg99zmrx6TwfbTMIwvvr4OOyCGPxBTp6pAGkJb6CgJYx1ciuBfiqKcCsb+bDpOfNtGYnEAAAAASUVORK5CYII=",
        img2: "/static/img/126866_banner.6c95fdb.png"
      },
      retartic: {
        text1: "相关文章",
        text2: "世界上唯一能克服焦虑症的地方,我想一辈子呆在哪里",
        text3: "生活不止眼前的苟且，还有诗和塞班",
        img1: "/static/img/500527491_wx.315b90c.png",
        img2: "/static/img/500124519_wx.6d67351.png"
      },
      msgboard:{
          text1:"",
          
      }
    };
  }
};
</script>