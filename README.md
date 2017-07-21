
<center><img src="/art/mundilogo.png"></center>

# Wallet SDK Android
[![](https://jitpack.io/v/Flip-Payments/mundipagg-wallet-android.svg)](https://jitpack.io/#Flip-Payments/mundipagg-wallet-android)

SDK de integração com o Mundipagg Wallet API.
Com essa SDK você poderá:

* Criar cartão
* Listar cartão
* Deletar cartão

###### Você pode ver toda a nossa documentação [aqui](https://github.com/mundipagg/mundipagg-wallet-android/wiki/Getting-Started)

### Gradle

Adicione o artifactory no `/build.gradle` raíz

```gradle
    allprojects {
        repositories {
            jcenter()
           maven { url "https://jitpack.io" }
        }
    }
```

E no seu `app/build.gradle`
```gradle
    // wallet sdk
     compile 'com.github.flip-Payments:mundipagg-wallet-android:x.x.x'
```

