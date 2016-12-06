
<center><img src="/art/mundilogo.png"></center>

# Wallet SDK Android

SDK de integração com o Mundipagg Wallet API.
Com essa SDK você poderá:

* Criar cartão
* Listar cartão
* Deletar cartão

###### Você pode ver toda a nossa documentação [aqui](https://github.com/mundipagg/mundipagg-wallet-android/wiki/Getting-Started)

#### TODO
* ~~Criar cartão~~
* ~~Listar cartão~~
* Deletar cartão

### Gradle

Adicione o artifactory no `/build.gradle` raíz

```gradle
    allprojects {
        repositories {
            jcenter()
            maven { url "http://dl.bintray.com/jgabrielfreitas/maven" }
        }
    }
```

E no seu `app/build.gradle`
```
    // wallet sdk
    compile 'com.mundipagg:walletsdk:0.0.6'
```

