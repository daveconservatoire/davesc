(ns davesc.views.static
  (:require [hiccup.core :as hiccup])
  (:require [davesc.views [layout :as layout]]))

(defn home []
  (layout/main
   (hiccup/html
    [:h2 [:p " Welcome to Dave Conservatoire - a free online music school, aiming to provide a world-class music education for everyone. "]]
)))

(defn about []
  (layout/main (hiccup/html [:p "TODO"])))
(defn contact []
  (layout/main (hiccup/html [:p "TODO"])))
(defn donate []
  (layout/main (hiccup/html [:p "TODO"])))
