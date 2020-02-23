<template>
  <div>
<headphotos></headphotos>
<recommend></recommend>
<imagetexts></imagetexts>
<pagefooter></pagefooter>
<popdestination></popdestination>

  </div>
</template>
<script>
import headphotos from "../tripcomponents/headphotos";
import recommend from "../tripcomponents/recommend";
import imagetexts from "../tripcomponents/imagetexts";
import pagefooter from "../pagebottom/pagefooter";
import popdestination from "../tripcomponents/popdestination";
    export default {
        components:{
                     headphotos:headphotos,
                     recommend:recommend,
                     imagetexts:imagetexts,
                     pagefooter:pagefooter,
                     popdestination:popdestination,
                },
        data(){
            return{
                
                   
                
            }
        }
    }
    </script>