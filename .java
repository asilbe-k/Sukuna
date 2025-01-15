import Grid2Background from 'https://cdn.jsdelivr.net/npm/threejs-components@0.0.17/build/backgrounds/grid2.cdn.min.js'

const bg = Grid2Background(document.getElementById('webgl-canvas'))

document.body.addEventListener('click', () => {
  bg.grid.setColors([0xffffff * Math.random(), 0xffffff * Math.random(), 0xffffff * Math.random()])
  bg.grid.light1.color.set(0xffffff * Math.random())
  bg.grid.light1.intensity = 500 + Math.random() * 1000
  bg.grid.light2.color.set(0xffffff * Math.random())
  bg.grid.light2.intensity = 250 + Math.random() * 250
  // bg.grid.plane.material.color.set(0xffffff * Math.random())
})
