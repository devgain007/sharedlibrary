def gitDownload(repo)
{
  git branch: 'main', url: "https://github.com/devgain007/${repo}.git"
}
