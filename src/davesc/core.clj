(ns davesc.core
  (:use compojure.core)
  (:require [ring.adapter.jetty  :as jetty]
            [compojure.handler   :as handler]
            [compojure.route     :as route]
            [davesc.views.static :as static]))

(defroutes app-routes
  (GET "/"          [] (static/home))
  (GET "/about"     [] (static/about))
  (GET "/contact"   [] (static/contact))
  (GET "/donate"    [] (static/donate))
  (route/files "/")
  (route/not-found "Page not found"))

(def app
  (handler/site app-routes))

(defn -main []
  (jetty/run-jetty #'app-routes {:port 8080}))
