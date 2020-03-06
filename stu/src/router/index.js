import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Update from '@/components/Update'
import Intesrt from '@/components/Intesrt'
import Mg from '@/components/Mg.vue'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
      children:[
        {
          path: '/Mg',
          name: 'Mg',
          component: Mg,
        }
        ]
    },
   {
     path: '/Update',
     name: 'Update',
     component: Update
   },
   {
     path: '/Intesrt',
     name: 'Intesrt',
     component: Intesrt
   }
  ]
})
