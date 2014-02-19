(ns davesc.views.layout
  (:use [hiccup.core])
  (:require [davesc.views.helpers :as h]))

(def nav {:home    {:name "Home" :href "#"}
          :about   {:name "About" :href "#about"}
          :contact {:name "Contact" :href "#contact"}})

(defn main [body]
  (html
   [:html
    [:head
     ;; Meta info and title
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
     [:meta {:name "author" :content "David Rees / Christopher Kuttruff"}]
     [:title "Dave Conservatoire - Free Online Music School"]
     [:link {:rel "shortcut icon" :href "/img/dcfavicon.ico"}]

     (h/include-css "/css/bootstrap.min.css")
     (h/include-css "/css/custom.css")]

    [:body
     [:div.navbar.navbar-fixed-top
      [:div.container
       [:div.navbar-header
        [:button.navbar-toggle {:type "button"
                                :data-toggle "collapse"
                                :data-target ".navbar-collapse"}
         [:span.sr-only "Toggle Navigation"]
         (repeat 3 [:span.icon-bar])]
        [:a.navbar-brand {:href "#"} [:img {"src" "/img/logo.png"
                                            "width"  "135"
                                            "height" "39"
                                            "alt" "Dave Conservatoire"}]]]
       [:div.navbar-collapse.collapse
        [:ul.nav.navbar-nav
         (for [[link name] [["/" "Home"]
                            ["/about" "About"]
                            ["/donate" "Donate"]
                            ["/contact" "Contact"]]]
           [:li [:a {:href link}
                 [:button.btn.btn-default {:type "button"} name]]])]]]]
     [:div.container
      [:div.row
       [:div.col-lg-2 [:div.container]

]
       [:div.col-lg-10 [:div.container.main body]]]]
     ;; Load js before close of body
     ;;(h/include-js  "/js/jquery.min.js")
     ;;(h/include-js  "/js/bootstrap.min.js")
     ]]))
