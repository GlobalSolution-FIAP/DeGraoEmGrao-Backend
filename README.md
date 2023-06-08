# DeGrãoEmGrão

# VIDEO DE APRESENTAÇÃO: https://photos.onedrive.com/share/59D75D7B5277275F!21402?cid=59D75D7B5277275F&authkey=!AHK3dkC6Nzj_L9M&ithint=video&e=luEibS

<br/>

- > <h2>DoadorPF</h2>
  - [Cadastrar](#cadastrar-doadorPF)
  - [Listar todos](#listar-doadorPF)
  - [Mostrar detalhes](#detalhar-um-doadorPF)
  - [Atualizar](#atualizar-doadorPF)
  - [Apagar](#apagar-doadorPF)

<br/>

- > <h2>DoadorPJ</h2>
  - [Cadastrar](#cadastrar-doadorPJ)
  - [Listar todos](#listar-doadorPJ)
  - [Mostrar detalhes](#detalhar-um-doadorPJ)
  - [Atualizar](#atualizar-doadorPJ)
  - [Apagar](#apagar-doadorPJ)

<br/>

- > <h2>Ong</h2>
  - [Cadastrar](#cadastrar-ong)
  - [Listar todas](#listar-ongs)
  - [Mostrar detalhes](#detalhar-uma-ong)
  - [Atualizar](#atualizar-ong)
  - [Apagar](#apagar-ong)

<br/>

- > <h2>Entregador</h2>
  - [Cadastrar](#cadastrar-entregador)
  - [Listar todas](#listar-entregadores)
  - [Mostrar detalhes](#detalhar-uma-entregador)
  - [Atualizar](#atualizar-entregador)
  - [Apagar](#apagar-entregador)

<br/>

- > <h2>Endereço</h2>
  - [Cadastrar](#cadastrar-endereco)
  - [Listar todos](#listar-enderecos)
  - [Mostrar detalhes](#detalhar-um-endereco)
  - [Atualizar](#atualizar-endereco)
  - [Apagar](#apagar-endereco)

<br/>

- > <h2>Doação</h2>
  - [Cadastrar](#cadastrar-doacao)
  - [Listar todos](#listar-doacao)
  - [Mostrar detalhes](#detalhar-uma-doacao)
  - [Buscar por nome](#detalhar-uma-doacao-por-nome)
  - [Atualizar](#atualizar-doacao)
  - [Apagar](#apagar-doacao)

<br/>


<details>
<summary>DoadorPF</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/doadorPF</summary>

<br/>

### Cadastrar DoadorPF

<br/>

### Requisição:

```json
{
	"id": 1,
	"nome": "Rodrigo Almeida",
	"cpf": "34637415865",
	"telefone": "1155873052",
	"email": "rodrigo@email.com.br",
	"senha": "123456@",
	"endereco": {
		"id": 1,
		"logradouro": null,
		"numero": null,
		"complemento": null,
		"bairro": null,
		"cep": null,
		"cidade": null,
		"estado": null,
		"pais": null
	}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Rodrigo Almeida",
	"cpf": "34637415865",
	"telefone": "1155873052",
	"email": "rodrigo@email.com.br",
	"senha": "ra9856247",
	"endereco": {
		"id": 1,
		"logradouro": "Av. do Taboão",
		"numero": "2754",
		"complemento": "Apto-25",
		"bairro": "Taboão",
		"cep": "09655000",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doadorPF</summary>

<br/>

### Listar doadoresPF

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
    "id": 1,
    "nome": "Rodrigo Almeida",
    "cpf": "34637415865",
    "telefone": "1155873052",
    "email": "rodrigo@email.com.br",
    "senha": "ra9856247",
    "endereco": {
      "id": 1,
      "logradouro": "Av. do Taboão",
      "numero": "2754",
      "complemento": "Apto-25",
      "bairro": "Taboão",
      "cep": "09655000",
      "cidade": "São Paulo",
      "estado": "SP",
      "pais": "Brasil"
    }
	},
  {
    "id": 2,
    "nome": "Gabriela Ferreira",
    "cpf": "25426355814",
    "telefone": "11995854175",
    "email": "gabriela@email.com.br",
    "senha": "gf365214",
    "endereco": {
      "id": 1,
      "logradouro": "Av. do Taboão",
      "numero": "2754",
      "complemento": "Apto-25",
      "bairro": "Taboão",
      "cep": "09655000",
      "cidade": "São Paulo",
      "estado": "SP",
      "pais": "Brasil"
    }
	}
]


```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há doadoresPF para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doadorPF{id}</summary>

<br/>

### Detalhar um doadorPF

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
  "nome": "Rodrigo Almeida",
  "cpf": "34637415865",
  "telefone": "1155873052",
  "email": "rodrigo@email.com.br",
  "senha": "ra9856247",
  "endereco": {
    "id": 1,
    "logradouro": "Av. do Taboão",
    "numero": "2754",
    "complemento": "Apto-25",
    "bairro": "Taboão",
    "cep": "09655000",
    "cidade": "São Paulo",
    "estado": "SP",
    "pais": "Brasil"
   }
},
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPF não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/doadorPF/{id}</summary>

<br/>

### Atualizar doadorPF

### Requisição:


```json
{
  "id": 1,
  "nome": "Rodrigo Almeida",
  "cpf": "34637415865",
  "telefone": "11998754182",
  "email": "rodrigo.almeida@email.com.br",
  "senha": "ra9856247",
  "endereco": {
    "id": 1,
    "logradouro": "Av. do Taboão",
    "numero": "2754",
    "complemento": "Apto-25",
    "bairro": "Taboão",
    "cep": "09655000",
    "cidade": "São Paulo",
    "estado": "SP",
    "pais": "Brasil"
   }
},
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "id": 1,
  "nome": "Rodrigo Almeida",
  "cpf": "34637415865",
  "telefone": "11998754182",
  "email": "rodrigo.almeida@email.com.br",
  "senha": "ra9856247",
  "endereco": {
    "id": 1,
    "logradouro": "Av. do Taboão",
    "numero": "2754",
    "complemento": "Apto-25",
    "bairro": "Taboão",
    "cep": "09655000",
    "cidade": "São Paulo",
    "estado": "SP",
    "pais": "Brasil"
   }
},
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/doadorPF/{id}</summary>

<br/>

### Apagar doadorPF

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPF apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPF não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id do doadorPF              |
|       nome        |    varchar(50)     |     sim     | Nome do doadorPF                 |
|       cpf        |    varchar(1)     |     sim     | CPF do doadorPF                 |
|       email       |    varchar(14)     |     sim     | Email do doadorPF   |
|       senha       |    varchar(30)     |     sim     | Senha do doadorPF|
|  telefone  | varchar(11) |     sim     | Telefone do doadorPF        |
|       endereco       | fk_id_endereco  |     sim     | Endereço do doadorPF   |


</details>

<details>
<summary>DoadorPJ</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/doadorPJ</summary>

<br/>

### Cadastrar DoadorPJ

<br/>

### Requisição:

```json
{
	{
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 2,
			"logradouro": null,
		  "numero": null,
		  "complemento": null,
		  "bairro": null,
		  "cep": null,
		  "cidade": null,
		  "estado": null,
		  "pais": null
		}
	}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Restaurante Baiano",
	"cnpj": "07033410000150",
	"telefone": "1155781245",
	"email": "contato@restaurantebaiano.com.br",
	"senha": "rb9876",
	"responsavel": "Solange Alves",
	"telResponsavel": "11995782121",
	"endereco": {
		"id": 2,
		"logradouro": "Rua Domingo de Moraes",
		"numero": "5241",
		"complemento": "",
		"bairro": "Saúde",
		"cep": "24255-141",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}

```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doadorPJ</summary>

<br/>

### Listar doadoresPJ

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
  {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 2,
			"logradouro": "Rua Domingo de Moraes",
		  "numero": "5241",
		  "complemento": "",
		  "bairro": "Saúde",
		  "cep": "24255-141",
		  "cidade": "São Paulo",
		  "estado": "SP",
		  "pais": "Brasil"
		}
	},
  {
		"id": 2,
		"nome": "Hortifrut Frescor",
		"cnpj": "04125232000185",
		"telefone": "1141758213",
		"email": "contato@hortifrutfrescor.com.br",
		"senha": "hf6958",
		"responsavel": "Ronaldo Nogueira",
		"telResponsavel": "11968457236",
		"endereco": {
			"id": 3,
			"logradouro": "Rua do Patriota",
		  "numero": "698",
		  "complemento": "",
		  "bairro": "Portuguesa",
		  "cep": "047255-003",
		  "cidade": "Santo André",
		  "estado": "SP",
		  "pais": "Brasil"
		}
	}
]


```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há doadoresPJ para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doadorPJ{id}</summary>

<br/>

### Detalhar um doadorPJ

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Restaurante Baiano",
	"cnpj": "07033410000150",
	"telefone": "1155781245",
	"email": "contato@restaurantebaiano.com.br",
	"senha": "rb9876",
	"responsavel": "Solange Alves",
	"telResponsavel": "11995782121",
	"endereco": {
		"id": 2,
		"logradouro": "Rua Domingo de Moraes",
		"numero": "5241",
		"complemento": "",
		"bairro": "Saúde",
		"cep": "24255-141",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPJ não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/doadorPJ/{id}</summary>

<br/>

### Atualizar doadorPJ

### Requisição:


```json
{
	"id": 1,
	"nome": "Restaurante Baiano",
	"cnpj": "07033410000150",
	"telefone": "1155781245",
	"email": "contato@restaurantebaiano.com.br",
	"senha": "rb9876",
	"responsavel": "Fabio Cristiano",
	"telResponsavel": "11994751452",
	"endereco": {
		"id": 2,
		"logradouro": "Rua Domingo de Moraes",
		"numero": "5241",
		"complemento": "",
		"bairro": "Saúde",
		"cep": "24255-141",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"nome": "Restaurante Baiano",
	"cnpj": "07033410000150",
	"telefone": "1155781245",
	"email": "contato@restaurantebaiano.com.br",
	"senha": "rb9876",
	"responsavel": "Fabio Cristiano",
	"telResponsavel": "11994751452",
	"endereco": {
		"id": 2,
		"logradouro": "Rua Domingo de Moraes",
		"numero": "5241",
		"complemento": "",
		"bairro": "Saúde",
		"cep": "24255-141",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/doadorPJ/{id}</summary>

<br/>

### Apagar doadorPJ

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPJ apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "DoadorPJ não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id do doadorPJ              |
|       nome        |    varchar(50)     |     sim     | Nome do doadorPJ                 |
|       cnpj        |    varchar(14)     |     sim     | CNPJ do doadorPJ               |
|       email       |    varchar(14)     |     sim     | Email do doadorPJ   |
|       senha       |    varchar(30)     |     sim     | Senha do doadorPJ |
|  telefone  | varchar(11) |     sim     | Telefone do doadorPJ        |
|  responsavel  | varchar(50) |     sim     | Responsavel da doação       |
|  telefone  | varchar(11) |     sim     | Telefone do doadorPJ        |
|       endereco       | fk_id_endereco  |     sim     | Endereço do doadorPF   |


</details>

<details>
<summary>Ong</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/ong</summary>

<br/>

### Cadastrar DoadorPJ

<br/>

### Requisição:

```json
{
  "id": 1,
	"nome": "Noite Sem Fome",
	"cnpj": "71725425001260",
	"telefone": "1141785050",
	"email": "contato@noitesemfome.com.br",
	"senha": "nsf96385",
	"responsavel": "Nicolas Penteado",
	"telResponsavel": "11992547485",
	"endereco": {
		"id": 5,
		"logradouro": null,
	  "numero": null,
	  "complemento": null,
	  "bairro": null,
	  "cep": null,
	  "cidade": null,
	  "estado": null,
	  "pais": null
	}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
	"nome": "Noite Sem Fome",
	"cnpj": "71725425001260",
	"telefone": "1141785050",
	"email": "contato@noitesemfome.com.br",
	"senha": "nsf96385",
	"responsavel": "Nicolas Penteado",
	"telResponsavel": "11992547485",
	"endereco": {
		"id": 5,
		"logradouro": "Rua Angélica",
	  "numero": 3264,
	  "complemento": "",
	  "bairro": "Viação",
	  "cep": "41255-475",
	  "cidade": "Rio de Janeiro",
	  "estado": "RJ",
	  "pais": "Brasil"
	}
}

```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/ong</summary>

<br/>

### Listar ong

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
  {
    "id": 1,
    "nome": "Noite Sem Fome",
    "cnpj": "71725425001260",
    "telefone": "1141785050",
    "email": "contato@noitesemfome.com.br",
    "senha": "nsf96385",
    "responsavel": "Nicolas Penteado",
    "telResponsavel": "11992547485",
    "endereco": {
      "id": 5,
      "logradouro": "Rua Angélica",
      "numero": 3264,
      "complemento": "",
      "bairro": "Viação",
      "cep": "41255-475",
      "cidade": "Rio de Janeiro",
      "estado": "RJ",
      "pais": "Brasil"
	}
}
 	{
		"id": 2,
		"nome": "Refeição do Bem",
		"cnpj": "09688210000142",
		"telefone": "1158582020",
		"email": "contato@refeicaodobem.com.br",
		"senha": "ob14785",
		"responsavel": "Ana Cristina",
		"telResponsavel": "11994715252",
		"endereco": {
			"id": 6,
			"logradouro": "Rua Atibaia",
			"numero": "471",
			"complemento": "",
			"bairro": "São Bento",
			"cep": "08544220",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	}
]


```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há ong para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/ong{id}</summary>

<br/>

### Detalhar um doadorPJ

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "Refeição do Bem",
	"cnpj": "09688210000142",
	"telefone": "1158582020",
	"email": "contato@refeicaodobem.com.br",
	"senha": "ob14785",
	"responsavel": "Ana Cristina",
	"telResponsavel": "11994715252",
	"endereco": {
		"id": 6,
		"logradouro": "Rua Atibaia",
		"numero": "471",
		"complemento": "",
		"bairro": "São Bento",
		"cep": "08544220",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Ong não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/ong/{id}</summary>

<br/>

### Atualizar ong

### Requisição:


```json
{
	"id": 2,
	"nome": "Refeição do Bem",
	"cnpj": "09688210000142",
	"telefone": "1158582020",
	"email": "contato@refeicaodobem.com.br",
	"senha": "ob14785",
	"responsavel": "Ana Cristina",
	"telResponsavel": "11994715252",
	"endereco": {
		"id": 6,
		"logradouro": "Rua Atibaia",
		"numero": "471",
		"complemento": "",
		"bairro": "São Bento",
		"cep": "08544220",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 2,
	"nome": "Refeição para Todos",
	"cnpj": "09688210000142",
	"telefone": "1158582020",
	"email": "contato@refeicaodobem.com.br",
	"senha": "ob14785",
	"responsavel": "Ana Cristina",
	"telResponsavel": "11994715252",
	"endereco": {
		"id": 6,
		"logradouro": "Rua Atibaia",
		"numero": "471",
		"complemento": "",
		"bairro": "São Bento",
		"cep": "08544220",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	}
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/ong/{id}</summary>

<br/>

### Apagar ong

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Ong apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "ONg não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id da ong              |
|       nome        |    varchar(50)     |     sim     | Nome da ong                 |
|       cnpj        |    varchar(14)     |     sim     | CNPJ da ong               |
|       email       |    varchar(14)     |     sim     | Email da ong  |
|       senha       |    varchar(30)     |     sim     | Senha da ong |
|  telefone  | varchar(11) |     sim     | Telefone da ong       |
|  responsavel  | varchar(50) |     sim     | Responsavel da doação       |
|  telefone  | varchar(11) |     sim     | Telefone da ong       |
|       endereco       | fk_id_endereco  |     sim     | Endereço da ong  |


</details>

<details>
<summary>Entregador</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/entregador</summary>

<br/>

### Cadastrar Entregador

<br/>

### Requisição:

```json
{
  "id": 1,
	"nome": "Alex Freitas",
	"cpf": "52415714102",
	"email": "alexf@email.com",
	"senha": "af7458",
	"telefone": "11995422512"
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
	"nome": "Alex Freitas",
	"cpf": "52415714102",
	"email": "alexf@email.com",
	"senha": "af7458",
	"telefone": "11995422512"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/entregador</summary>

<br/>

### Listar entregadores

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
	{
		"id": 1,
		"nome": "Alex Freitas",
		"cpf": "52415714102",
		"email": "alexf@email.com",
		"senha": "af7458",
		"telefone": "11995422512"
	},
	{
		"id": 3,
		"nome": "Caio Brito",
		"cpf": "52896945832",
		"email": "caio@email.com",
		"senha": "cb85475",
		"telefone": "11997958469"
	},
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há entregador para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/entregador{id}</summary>

<br/>

### Detalhar um entregador

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "id": 1,
	"nome": "Alex Freitas",
	"cpf": "52415714102",
	"email": "alexf@email.com",
	"senha": "af7458",
	"telefone": "11995422512"
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "entregador não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/entregador/{id}</summary>

<br/>

### Atualizar entregador

### Requisição:


```json
{
  "id": 1,
	"nome": "Alex Freitas",
	"cpf": "52415714102",
	"email": "alex_freitasf@email.com",
	"senha": "af7458",
	"telefone": "11995422512"
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
  "id": 1,
	"nome": "Alex Freitas",
	"cpf": "52415714102",
	"email": "alex_freitasf@email.com",
	"senha": "af7458",
	"telefone": "11995422512"
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/entregador/{id}</summary>

<br/>

### Apagar entregador

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Entregador apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Entregador não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id do entregador             |
|       nome        |    varchar(50)     |     sim     | Nome do entregador               |
|       cpf        |    varchar(1)     |     sim     | CPF do entregador                |
|       email       |    varchar(14)     |     sim     | Email do entregador   |
|       senha       |    varchar(30)     |     sim     | Senha do entregador|
|  telefone  | varchar(11) |     sim     | Telefone do entregador     |

</details>


<details>
<summary>Endereço</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/endereco</summary>

<br/>

### Cadastrar endereco

<br/>

### Requisição:

```json
{
	"id": 1,
	"logradouro": "Av. do Taboão",
	"numero": "2754",
	"complemento": "Apto-25",
	"bairro": "Taboão",
	"cep": "09655000",
	"cidade": "São Paulo",
	"estado": "SP",
	"pais": "Brasil"
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"logradouro": "Av. do Taboão",
	"numero": "2754",
	"complemento": "Apto-25",
	"bairro": "Taboão",
	"cep": "09655000",
	"cidade": "São Paulo",
	"estado": "SP",
	"pais": "Brasil"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/endereco</summary>

<br/>

### Listar endereços

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
[
  {
		"id": 1,
		"logradouro": "Av. do Taboão",
		"numero": "2754",
		"complemento": "Apto-25",
		"bairro": "Taboão",
		"cep": "09655000",
		"cidade": "São Paulo",
		"estado": "SP",
		"pais": "Brasil"
	},
	{
		"id": 2,
		"logradouro": "Rua Bernardo Leite",
		"numero": "806",
		"complemento": "",
		"bairro": "Suisso",
		"cep": "04532785",
		"cidade": "Santo Andre",
		"estado": "SP",
		"pais": "Brasil"
	},
]
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há endereco para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/endereco{id}</summary>

<br/>

### Detalhar um endereco

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 1,
	"logradouro": "Av. do Taboão",
	"numero": "2754",
	"complemento": "Apto-25",
	"bairro": "Taboão",
	"cep": "09655000",
	"cidade": "São Paulo",
	"estado": "SP",
	"pais": "Brasil"
}
```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Endereço não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/endereco/{id}</summary>

<br/>

### Atualizar entregador

### Requisição:


```json
{
	"id": 1,
	"logradouro": "Avenida do Taboão",
	"numero": "2754",
	"complemento": "Apto-76",
	"bairro": "Taboão",
	"cep": "09655000",
	"cidade": "São Paulo",
	"estado": "SP",
	"pais": "Brasil"
}
```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 1,
	"logradouro": "Avenida do Taboão",
	"numero": "2754",
	"complemento": "Apto-76",
	"bairro": "Taboão",
	"cep": "09655000",
	"cidade": "São Paulo",
	"estado": "SP",
	"pais": "Brasil"
}
```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/endereco/{id}</summary>

<br/>

### Apagar endereco

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Endereço apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Endereço não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id do endereço             |
|       logradouro        |    varchar(80)     |     sim     | Logradoro             |
|       numero        |    varchar(50)     |     sim     | Número do endereço               |
|       complemento       |    varchar(80)     |     não     | Complemento do endereço  |
|       bairro       |    varchar(80)     |     sim     | Bairro do endereço|
|  cep  | varchar(8) |     sim     | CEP do endereço    |
|  cidade  | varchar(50) |     sim     | Cidade do endereço    |
|  estado  | varchar(5) |     sim     | Estado do endereço    |
|  pais  | varchar(30) |     sim     | Pais do endereço    |


</details>

<details>
<summary>Doação</summary>

<br>

<details>
<summary> <b style="color:green">POST</b>/deGraoEmGrao/doacao</summary>

<br/>

### Cadastrar doacao

<br/>

### Requisição:

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": null,
		"cnpj": null,
		"telefone": null,
		"email": null,
		"senha": null,
		"responsavel": null,
		"telResponsavel": null,
		"endereco": {
			"id": 4,
			"logradouro": null,
			"numero": null,
			"complemento": null,
			"bairro": null,
			"cep": null,
			"cidade": null,
			"estado": null,
			"pais": null
		}
	},
		"ong": {
			"id": 1,
			"nome": null,
			"cnpj": null,
			"telefone": null,
			"email": null,
			"senha": null,
			"responsavel": null,
			"telResponsavel": null,
			"endereco": {
				"id": 6,
				"logradouro": null,
				"numero": null,
				"complemento": "",
				"bairro": null,
				"cep": null,
				"cidade": null,
				"estado": null,
				"pais": null
			}
		},
		"entregador": {
			"id": 1,
			"nome": null,
			"cpf": null,
			"email": null,
			"senha": null,
			"telefone": null
		}
}
```

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

<br/>
</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doacao</summary>

<br/>

### Listar doacao

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
]
  {
			"id": 2,
			"nome": "Peixe",
			"quantidade": 0.8,
			"dataValidade": "2023-06-06T03:00:00.000+00:00",
			"categoria": "CARNES",
			"condicao": "fresco",
			"dataEntrega": "2023-06-07T03:00:00.000+00:00",
			"status": false,
			"doadorPF": {
				"id": 1,
				"nome": "Maria Cardoso",
				"cpf": "25428753614",
				"telefone": "11947521358",
				"email": "maria@email.com",
				"senha": "m12345",
				"endereco": {
					"id": 1,
					"logradouro": "Av. do Taboão",
					"numero": "2754",
					"complemento": "Apto-25",
					"bairro": "Taboão",
					"cep": "09655000",
					"cidade": "São Paulo",
					"estado": "SP",
					"pais": "Brasil"
			},
			"doadorPJ": null,
			"ong": {
				"id": 1,
				"nome": "Refeição do Bem",
				"cnpj": "09688210000142",
				"telefone": "1158582020",
				"email": "contato@refeicaodobem.com.br",
				"senha": "ob14785",
				"responsavel": "Ana Cristina",
				"telResponsavel": "11994715252",
				"endereco": {
					"id": 6,
					"logradouro": "Rua Atibaia",
					"numero": "471",
					"complemento": "",
					"bairro": "São Bento",
					"cep": "08544220",
					"cidade": "São Paulo",
					"estado": "SP",
					"pais": "Brasil"
				}
			},
			"entregador": {
				"id": 1,
				"nome": "Alex Freitas",
				"cpf": "52415714102",
				"email": "alexf@ail.com",
				"senha": "af7458",
				"telefone": "11995422512"
			}
		},
		{
			"id": 3,
			"nome": "Chocolate",
			"quantidade": 1.0,
			"dataValidade": "2023-06-06T03:00:00.000+00:00",
			"categoria": "DOCES",
			"condicao": "fresco",
			"dataEntrega": "2023-06-07T03:00:00.000+00:00",
			"status": false,
			"doadorPF": null,
			"doadorPJ": {
				"id": 1,
				"nome": "Restaurante Baiano",
				"cnpj": "07033410000150",
				"telefone": "1155781245",
				"email": "contato@restaurantebaiano.com.br",
				"senha": "rb9876",
				"responsavel": "Solange Alves",
				"telResponsavel": "11995782121",
				"endereco": {
					"id": 4,
					"logradouro": "Rod. Raposo",
					"numero": "s/n",
					"complemento": "Lote5",
					"bairro": "Dom Vilares",
					"cep": "74582222",
					"cidade": "São Paulo",
					"estado": "SP",
					"pais": "Brasil"
				}
			},
			"ong": {
				"id": 1,
				"nome": "Refeição do Bem",
				"cnpj": "09688210000142",
				"telefone": "1158582020",
				"email": "contato@refeicaodobem.com.br",
				"senha": "ob14785",
				"responsavel": "Ana Cristina",
				"telResponsavel": "11994715252",
				"endereco": {
					"id": 6,
					"logradouro": "Rua Atibaia",
					"numero": "471",
					"complemento": "",
					"bairro": "São Bento",
					"cep": "08544220",
					"cidade": "São Paulo",
					"estado": "SP",
					"pais": "Brasil"
				}
			},
			"entregador": {
				"id": 1,
				"nome": "Alex Freitas",
				"cpf": "52415714102",
				"email": "alexf@ail.com",
				"senha": "af7458",
				"telefone": "11995422512"
			}
		}
]

```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Não há doação para retornar"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doacao{id}</summary>

<br/>

### Detalhar um doação

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Doação não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doacao/nome</summary>

<br/>

### Detalhar uma doação por nome

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Doação não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doacao/dataVencimento</summary>

<br/>

### Detalhar uma doação por data de vendimento

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Doação não cadastrado"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:cyan">GET</b>/deGraoEmGrao/doacao/categoria</summary>

<br/>

### Detalhar uma doação por categoria

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 1.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": false,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```

<br/>
<hr>

`status code: 204`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Doação não cadastrada"
}
```

<br/>
<hr>

`status code: 400`


```json
{
  "retorno": "Mensagem de erro conforme regras de negócios"
}
```

</details>

<details>
<summary> <b style="color:orange">UPDATE</b>/deGraoEmGrao/doacao/{id}</summary>

<br/>

### Atualizar docação

### Requisição:


```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 3.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": true,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```
<br/>

<br/>

### Responses:

`status code: 200`

#### Tipo do body: <b>Application/json</b>

```json
{
	"id": 3,
	"nome": "Chocolate",
	"quantidade": 3.0,
	"dataValidade": "2023-06-06T03:00:00.000+00:00",
	"categoria": "DOCES",
	"condicao": "fresco",
	"dataEntrega": "2023-06-07T03:00:00.000+00:00",
	"status": true,
	"doadorPF": null,
	"doadorPJ": {
		"id": 1,
		"nome": "Restaurante Baiano",
		"cnpj": "07033410000150",
		"telefone": "1155781245",
		"email": "contato@restaurantebaiano.com.br",
		"senha": "rb9876",
		"responsavel": "Solange Alves",
		"telResponsavel": "11995782121",
		"endereco": {
			"id": 4,
			"logradouro": "Rod. Raposo",
			"numero": "s/n",
			"complemento": "Lote5",
			"bairro": "Dom Vilares",
			"cep": "74582222",
			"cidade": "São Paulo",
			"estado": "SP",
			"pais": "Brasil"
		}
	},
		"ong": {
			"id": 1,
			"nome": "Refeição do Bem",
			"cnpj": "09688210000142",
			"telefone": "1158582020",
			"email": "contato@refeicaodobem.com.br",
			"senha": "ob14785",
			"responsavel": "Ana Cristina",
			"telResponsavel": "11994715252",
			"endereco": {
				"id": 6,
				"logradouro": "Rua Atibaia",
				"numero": "471",
				"complemento": "",
				"bairro": "São Bento",
				"cep": "08544220",
				"cidade": "São Paulo",
				"estado": "SP",
				"pais": "Brasil"
			}
		},
		"entregador": {
			"id": 1,
			"nome": "Alex Freitas",
			"cpf": "52415714102",
			"email": "alexf@ail.com",
			"senha": "af7458",
			"telefone": "11995422512"
		}
}

```
<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>


```json
{
  "retorno": "{Mensagem de erro conforme regra de negocio}"
}
```

</details>

<details>
<summary> <b style="color:red">DELETE</b>/deGraoEmGrao/doacao/{id}</summary>

<br/>

### Apagar doadorPJ

<br/>

### Responses:

`status code: 200`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Docação apagado com sucesso"
}
```

<br/>
<hr>

`status code: 400`

#### Body: <b>Application/json</b>

```json
{
  "retorno": "Docação não cadastrado"
}
```

</details>

<br/><br/>

# Campos de Requisição

|       campo       |     tipo    | obrigatório |descrição                  |
| :---------------: | :---------: | :---------: | ------------------------|
|        id         |    numeric(10)     |     sim     | Id da docação             |
|       nome        |    varchar(50)     |     sim     | Nome do produto doado                 |
|       quantidade        |    double(4, 3)     |     sim     | Quantidade do produto doado     |
|       dataValidade        |    Date     |     sim     | Data da validade do produto              |
|       categoria       |    varchar(50)     |     sim     | Categoria do produto |
|       condicao       |    varchar(20)     |     sim     | Informa se o produto é fresco ou congelado|
|  dataValidade  | Date |     sim     | Data da entrega do produto       |
|  status  | boolean |     sim     | Caso doação ter sido entregue, seta para true, se não, false     |



</details>
