(ns latex.app
  (:require [reagent.core :as r]))

(defn app []
  [:div#app
   [:h1 "latex"]
   [:svg {:width 20
          :view-box "0 0 800 800"}
    [:path {:stroke "#000000"
            :d "M228 684Q228 708 274 712 292 712 292 723 292 724 290 736 287 750 284 754T271 758Q269 758 259 758T225 757 161 756Q90 756 70 758H62Q55 751 55 747 57 720 68 712H82Q152 709 184 662 190 656 365 357T543 54Q550 42 567 42H592Q598 51 598 52L626 375Q654 698 656 701 661 712 721 712 746 712 746 722 746 724 743 736 740 751 738 754T724 758Q721 758 710 758T671 757 598 756Q504 756 475 758H463Q457 752 457 749T459 731Q463 718 465 715L469 712H489Q543 709 553 695L541 545H303L269 603Q228 672 228 684ZM536 498Q536 487 524 342T510 196L483 239Q467 266 420 346L330 498 433 499Q536 499 536 498Z"}]]])

(defn render []
  (r/render [app]
            (.getElementById js/document "root")))

(defn ^:dev/after-load start []
  (render)
  (js/console.log "start"))

(defn ^:export init []
  (js/console.log "init")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
