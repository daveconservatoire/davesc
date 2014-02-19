(ns davesc.views.helpers
  (:use [hiccup.core]))

(defn include-css [href]
  [:link {:rel "stylesheet" :href href}])

(defn include-js [src]
  [:script {:src src}])
