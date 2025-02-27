<?php
    $date = date("d/m/y");//Hoje é 25/02/2025
    echo "<h1 style='text-align: center;'>===Aula PHP Laercio===</h1><h3 style='text-align: center;'>----Hoje é: $date----</h3>";
    
    // Testando laço foreach
    $carros = ["civic", "golf", "gol", "lancer", "uno"];
    
    echo "<h2>Testando laço foreach</h2>";
    echo "<h3>Mostrando carros:</h3>";
    foreach ( $carros as $garage){
        echo strtoupper("$garage<br>");
    }

    // Testando laço while e for
    echo "<h2>Testando laço while</h2>";
    $nume = 10;
    $multi = 1;
    while ($multi <= $nume){
        $result = $nume * $multi;
        echo "$result<br>";
        $multi++;
    }
    
    echo "<h2>Testando laço for</h2>";
    
    for ($i=0; $i <= 10; $i++){
        echo "$i<br>";
    }

    // Testando if, elseif, else
    echo "<h2 style='text-align: center;'>===Exercicio professor===</h2>";
    $data = date("d-m-y");
    $salario = 1500.00;
    $cargo = "Analista de sistemas";
    $idade = 18;
    $vivo = true;

    if ($vivo == true){     
        echo "<h4 style='text-align: center;'>Verdadeiro</h4>";
        echo "<h4 style='text-align: center;'>$salario</h4>";
    }
    else{
        echo "Falso";
    }

    // Testando switch 
    echo "<h2>Testando switch case</h2>";
    $valor = 8;

    switch ($valor){
        case 1:
            echo "Seu numero é 1";
            break;
        case 2:
            echo "Seu numero é 2";
            break;
        case 3:
            echo "Seu numero é 3";
            break;
        case 4:
            echo "Seu numero é 4";
            break;
        case 5:
            echo "Seu numero é 5";
            break;
        case 6:
            echo "Seu numero é 6";
            break;
        case 7:
            echo "Seu numero é 7";
            break;
        case 8:
            echo "Seu numero é 8";
            break;
        case 9:
            echo "Seu numero é 9";
            break;
        case 10:
            echo "Seu numero é 10";
            break;
    }

?>