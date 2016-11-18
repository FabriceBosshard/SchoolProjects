using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

namespace SpaceInvaders
{
    class KeyHandler
    {
        private Player man = null;
        public void OnKeyDown(object sender, KeyEventArgs e)
        {
            switch (e.Key)
            {
                case Key.Left:
                    if (man.previousDirection != (int)Player.Direction.Right)
                        man.direction = (int)Player.Direction.Left;
                    break;
                case Key.Right:
                    if (man.previousDirection != (int)Player.Direction.Left)
                        man.direction = (int)Player.Direction.Right;
                    break;
            }
            man.previousDirection = man.direction;
        }
    }
}
