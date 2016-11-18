using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace SpaceInvaders
{
    class Player
    {
        public int direction = 0;
        public int previousDirection = 0;
        public Point currentPosition;

        public enum Direction : byte
        {
            Up = 1,
            Down = 2,
            Left = 3,
            Right = 4
        };

        public void shoot()
        {
        }

        public Player(Point p)
        {

        }
    }
}
