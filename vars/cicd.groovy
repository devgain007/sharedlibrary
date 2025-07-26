def Gitdownload(repo)
{
   git credentialsId: 'github-creds', branch: 'main', url: "https://github.com/devgain007/${repo}.git"

}
