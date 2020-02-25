<template>
    <div>
        <phos></phos>
        <div class="exp2part0">
        <div class="exp2part1"></div>
        <div class="exp2part2">
            <photext></photext>
        </div>
        <div class="exp2part3"></div>
        </div>
    </div>
</template>
<style scoped>
.exp2part0{
    width:1440px;
    margin:0 auto;
}
.exp2part1{
    height: 95px;
    width:840px;
    margin-left: 120px;
    float:left;
    background:green;
}
.exp2part2{
    width:840px;
    height: 1170px;
    float: left;
    margin-left: 120px;
    /* background: red; */
}
.exp2part3{
    width:288px;
height:754px;
background:rgba(248,249,250,1);
float: left;
margin-left: 42px;
margin-top:-63px;
}
</style>
<script>
import phos from "../communitycomponents/phos";
import photext from "../communitycomponents/photext";
export default {
    components:{
phos:phos,
photext:photext,
    },

  
}
</script>