const imgSrc = 'main_img.jpg'

// 네비게이션바 만들기

// 메뉴 만들기
const menu = document.createElement('div')
menu.id = 'menu'

for(let i=0;i<3;i++){
    const bar = document.createElement('div')
    bar.className = 'bar'
    menu.appendChild(bar)
}
console.log(menu)

// 스크린모드 만들기
const circleBtn = document.createElement('div')
circleBtn.id = 'circle-btn'
const screenMode = document.createElement('div')
screenMode.id = 'screen-mode'

screenMode.appendChild(circleBtn)
console.log(screenMode)

// 프로필 이미지 만들기
const img = document.createElement('img')
img.src = imgSrc
const profileMenu = document.createElement('div')
profileMenu.id = 'profile-menu'
profileMenu.appendChild(img)
console.log(profileMenu)

// 네비게이션바에 자식요소 추가하기
const nav = document.createElement('div')
nav.id = 'nav'
nav.append(menu, screenMode, profileMenu)
console.log(nav)

// 헤딩 만들기
const h1 = document.createElement('h1')
h1.innerText = 'My photo gallery'
const h4 = document.createElement('h4')
h4.innerText = 'my old memories from my life'

const heading = document.createElement('div')
heading.id = 'heading'
heading.append(h1, h4)

const input = document.createElement('input')
input.type = 'text'
input.placeholder = 'Search photo ...'

const search = document.createElement('div')
search.id = 'search'

search.appendChild(input)
console.log(search)

// 헤딩과 서치를 center 에 추가하기
const center = document.createElement('div')
center.id = 'center'
center.append(heading, search)

const title = document.createElement('div')
title.id = 'title'
title.appendChild(center)
console.log(title)

// 사진 리스트 만들기
const photoList = document.createElement('div')
photoList.id = 'photo-list'

for(let i=0;i<9;i++){
    const img = document.createElement('img')
    img.src = imgSrc
    const photoCard = document.createElement('div')
    photoCard.className = 'photo-card'
    photoCard.appendChild(img)

    const photoName = document.createElement('div')
    photoName.className = 'photo-name'
    photoName.innerText = 'Photo Name'

    const photoContainer = document.createElement('div')
    photoContainer.className = 'photo-container'

    photoContainer.append(photoCard, photoName)

    photoList.appendChild(photoContainer)
}
// 모달창 만들기
const header = document.createElement('div')
header.id = 'header'
header.innerText = 'Food Recipe'

const p = document.createElement('p')
p.innerText = 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Error modi nesciunt facilis tempora qui temporibus, odio dolores reiciendis, quis voluptate ducimus quam. Voluptatum omnis, rem quam porro ipsam nam dolorum. Laudantium aliquam suscipit, nobis exercitationem neque inventore incidunt quos possimus numquam! Temporibus adipisci, illum in fuga earum magnam consequatur minima. Neque, labore esse tempora tenetur doloribus beatae. Facere, dolorum incidunt? Nulla facere earum fuga doloremque magni. Aspernatur excepturi ipsam commodi in ullam? Dolore, ipsa, a dignissimos, vel nulla alias accusantium qui voluptatibus officia minus est libero! Adipisci, fugit? Architecto, quia!'

const body = document.createElement('div')
body.id = 'body'

body.appendChild(p)

const button = document.createElement('button')
button.innerText = 'Close'

const footer = document.createElement('div')
footer.id = 'footer'
footer.appendChild(button)

const modalWindow = document.createElement('div')
modalWindow.className = 'modal-window'

modalWindow.append(header, body, footer)

// 바디에 nav, title, photoList, modalWindow 추가하기
document.body.append(nav, title, photoList, modalWindow)

const subHeading = document.querySelector('#heading h4')
subHeading.innerText = '내 인생의 좋은 추억들'

// 연습과제 4
const profileMenuSearched = document.getElementById('profile-menu')
const profileImg = profileMenuSearched.querySelector('img')
console.log(profileImg)
profileImg.src ='1.jpg'

// 연습과제 5
const photoItem = document.querySelectorAll('.photo-card img')[2]
console.log(photoItem)
photoItem.src = '1.jpg'

// 연습과제 6
const photoNameSearched = document.querySelectorAll('.photo-name')[4]
photoNameSearched.innerText = 'sunrise'

// 연습과제 7
const modalWindowSearched = document.querySelector('.modal-window')
// modalWindowSearched.classList.add('hide')

















