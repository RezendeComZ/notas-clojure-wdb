(def notas [{:title "Lista de compras"
             :body "Março 2023"
             :lists [{:title "Limpeza"
                       :itens [{:name "Detergente"
                                 :selected true}
                                {:name "Amaciante"
                                 :selected false}
                                {:name "Veja"
                                 :selected false}]}
                      {:title "Comida"
                       :itens [{:name "Arroz"
                                 :selected true}
                                {:name "Feijão"
                                 :selected false}]}
                      {:itens [{:name "Arroz"
                                 :selected true}
                                {:name "Feijão"
                                 :selected false}]}]
             :labels ["compras" "mercado"]
             :pinned true
             :color "blue"
             :reminders [{:day "2023-03-22"
                           :time "20:38"}]
             :public true
             :user "rezende"
             :permissions [{:user "joao1979"
                            :allowRead true
                            :allowEdit true}]
             :url "listaCompras"}])