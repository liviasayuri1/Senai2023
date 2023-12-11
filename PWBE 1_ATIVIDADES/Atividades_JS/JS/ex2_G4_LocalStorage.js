let numero;
        let chance;
        let tentativas = [];
        let pontos = 0; // Adicionei a variável pontos que estava faltando

        // Verificando se há valores armazenados no LocalStorage
        if(localStorage.getItem("numero") === null) {
            // Se não houver, sorteie um novo número
            numero = Math.floor(Math.random()*100);
            localStorage.setItem("numero", numero);
        } else {
            // Se houver, recupere o número do LocalStorage
            numero = parseInt(localStorage.getItem("numero"));
        }

        if(localStorage.getItem("chance") === null) {
            chance = 3;
            localStorage.setItem("chance", chance);
        } else {
            chance = parseInt(localStorage.getItem("chance"));
        }

        document.getElementById("chance").innerHTML = "Chance " + chance;

        function submit(){
            chance = 3;
            localStorage.setItem("chance", chance);

            let inNumberPlayer = document.getElementById("tentativa").value;
            tentativas.push(inNumberPlayer);

            if(isNaN(inNumberPlayer)){
                document.getElementById("coment").innerHTML = "Isso não é um número"
            } else if(inNumberPlayer == ""){  
                document.getElementById("coment").innerHTML = "Tente para acertar o valor"
            } else if(inNumberPlayer > numero){
                document.getElementById("coment").innerHTML = "O valor é mais baixo do que o fornecido";
                chance--;
                document.getElementById("chance").innerHTML = "Chance " + chance;
                localStorage.setItem("chance", chance);
                if(chance == 0){
                    document.getElementById("chance").innerHTML = "Suas chances acabaram";
                    document.getElementById("submit").disabled = true;
                }
            } else if(inNumberPlayer < numero){
                document.getElementById("coment").innerHTML = "O valor é mais alto do que o fornecido"
                chance--;
                document.getElementById("chance").innerHTML = "Chance " + chance;
                localStorage.setItem("chance", chance);
                if(chance == 0){
                    document.getElementById("chance").innerHTML = "Suas chances acabaram";
                    document.getElementById("submit").disabled = true;
                }
            } else {
                document.getElementById("coment").innerHTML = "Você acertou o número sorteado"
                pontos += (4 - chance);
                localStorage.removeItem("numero");
                localStorage.removeItem("chance");
                localStorage.setItem("pontos", pontos); // Adicionei a pontuação ao LocalStorage
            }

            document.getElementById("historico").innerHTML = "Histórico: " + tentativas.join(", ");
            document.getElementById("pontuacao").innerHTML = "Pontuação: " + pontos; // Adicionei a exibição da pontuação
        }