<template>
  <div>
<headphotos></headphotos>
<recommend></recommend>
<imagetexts></imagetexts>
  </div>
</template>
<script>
import headphotos from "../tripcomponents/headphotos";
import recommend from "../tripcomponents/recommend";
import imagetexts from "../tripcomponents/imagetexts";
    export default {
        components:{
                     headphotos:headphotos,
                     recommend:recommend,
                     imagetexts:imagetexts,
                },
        data(){
            return{
                
                   
                
            }
        }
    }
    </script>