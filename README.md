## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Sincronizando o Git com VSCode

Em sua máquina, criar um diretório. Após, criar um novo repositório no Github.

O repositório pode ser criado com os arquivos .gitignore e o Readme, com o status Public.

Com o repositório criado, pegar o link em Code > HTTPS.

No VsCode, em Accounts > Entrar nas Configurações de Sincronização > Entrar com GitHub (será solicitado o login para acesso)

Com a conta sincronizada Crtl+Shift+P > Git Clone/Clonar > Clonar de Github (será solicitado login para acesso)

Após, localizar o nome do repositório criado no Github pelo o VsCode. Escolher o diretório criado.

Criar um novo Java Project com Crtl +Shift + P, Java:Create Java Project > No build tools > Nomear o projeto > Add Settings.json ao .gitignore

Em Source Control (Ctrl +Shift + P) + Nomear o Commit + Acionar o Commit + Confirmar a sincronização Sync Changes

### Atalhos VsCode

Crtl + D seleciona todas variáveis
Crtl + Shift + L extensão para sysout

### Git comandos
git status
git log
git log --pretty=oneline

