import Vue from 'vue'
import App from './App'
import router from './router'

import jQuery from 'jquery'
import './assets/dist/css/bootstrap.min.css'
import './assets/dist/js/bootstrap.min.js'
import './assets/font-awesome-4.7.0/css/font-awesome.min.css'
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
